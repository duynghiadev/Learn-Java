package com.agu.findthewayjpa.data;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class PresenceTracker {
    private final static ConcurrentHashMap<String, List<WebSocketSession>> onlineUsers = new ConcurrentHashMap<>();

    public void connect(String username, WebSocketSession session){
        if(!onlineUsers.contains(username)){
            List array = new ArrayList<>();
            array.add(session);
            onlineUsers.put(username, array);
        }else{
            onlineUsers.get(username).add(session);
        }
    }

    public void disConnect(String username, WebSocketSession session){
        var arr = onlineUsers.get(username);
        if(arr != null){
            arr.remove(session);
            if(arr.isEmpty()) onlineUsers.remove(username);
        }
    }

    public List<WebSocketSession> getSessionUsername(String username){
        return onlineUsers.get(username);
    }

    public List<String> getUserOnline(){
        return Collections.list(onlineUsers.keys());
    }
}
