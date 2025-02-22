package com.agu.findthewayjpa.pub_sub;

import com.agu.findthewayjpa.data.PresenceTracker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MessageSubscriber implements MessageListener {
    private final PresenceTracker presenceTracker;

    @Override
    public void onMessage(Message message, byte[] pattern) {
        List<String> users = presenceTracker.getUserOnline();
        for(String user: users){
            List<WebSocketSession> ss = presenceTracker.getSessionUsername(user);
            if(ss != null){
                for(WebSocketSession sUser: ss){
                    WebSocketMessage<String> msg = new TextMessage(message.toString());
                    try {
                        sUser.sendMessage(msg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        log.info("Received message: " + message.toString());
    }
}
