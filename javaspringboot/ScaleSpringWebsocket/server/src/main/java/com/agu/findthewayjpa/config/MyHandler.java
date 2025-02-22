package com.agu.findthewayjpa.config;

import com.agu.findthewayjpa.data.Payload;
import com.agu.findthewayjpa.data.PresenceTracker;
import com.agu.findthewayjpa.exceptions.UnAuthorizedException;
import com.agu.findthewayjpa.pub_sub.MessagePublisherImpl;
import com.agu.findthewayjpa.security.JwtTokenProvider;
import lombok.AllArgsConstructor;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
public class MyHandler extends TextWebSocketHandler {
    private PresenceTracker presenceTracker;
    private JwtTokenProvider jwtTokenProvider;
    private MessagePublisherImpl messagePublisher;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String token = session.getUri().getQuery().split("token=")[1];
        if(jwtTokenProvider.validateToken(token)){
            //String currentUsername = jwtTokenProvider.getUsername(token);
            Payload payload = new Payload("PRIVATE", message.getPayload());
            messagePublisher.publish(payload.toJson());
        }else {
            throw new UnAuthorizedException("Invalid token");
        }
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        String token = session.getUri().getQuery().split("token=")[1];
        if(jwtTokenProvider.validateToken(token)){
            String username = jwtTokenProvider.getUsername(token);
            presenceTracker.connect(username, session);
        }else {
            throw new UnAuthorizedException("Invalid token");
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        String token = session.getUri().getQuery().split("token=")[1];
        String username = jwtTokenProvider.getUsername(token);
        presenceTracker.disConnect(username, session);
    }
}
