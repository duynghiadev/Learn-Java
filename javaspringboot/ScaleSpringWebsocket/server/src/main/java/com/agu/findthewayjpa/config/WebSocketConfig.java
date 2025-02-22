package com.agu.findthewayjpa.config;

import com.agu.findthewayjpa.data.PresenceTracker;
import com.agu.findthewayjpa.pub_sub.MessagePublisherImpl;
import com.agu.findthewayjpa.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    PresenceTracker presenceTracker;

    @Autowired
    private MessagePublisherImpl messagePublisher;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/findtheway").setAllowedOrigins("http://localhost:3000");
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler(presenceTracker, jwtTokenProvider, messagePublisher);
    }
}
