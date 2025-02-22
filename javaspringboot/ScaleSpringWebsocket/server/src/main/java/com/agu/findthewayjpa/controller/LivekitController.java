package com.agu.findthewayjpa.controller;

import com.agu.findthewayjpa.services.UserService;
import com.agu.findthewayjpa.utils.Constant;
import io.livekit.server.AccessToken;
import io.livekit.server.RoomJoin;
import io.livekit.server.RoomName;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RequestMapping(Constant.apiVersion + "/livekit")
@RestController
public class LivekitController {

    private final UserService userService;

    @Value("${livekit.apiKey}")
    private String apiKey;

    @Value("${livekit.apiSecret}")
    private String apiSecret;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping
    public ResponseEntity<Object> getToken(@RequestParam String roomName){
        AccessToken token = new AccessToken(apiKey, apiSecret);
        String username = userService.getCurrentUsername();
// Fill in token information.
        token.setName(username);
        token.setIdentity(username);
        //token.setMetadata("metadata");
        token.addGrants(new RoomJoin(true), new RoomName(roomName));
        
        Map<String, String> map = new HashMap<>();
        map.put("livekit_token", token.toJwt());
        return ResponseEntity.ok(map);
    }
}
