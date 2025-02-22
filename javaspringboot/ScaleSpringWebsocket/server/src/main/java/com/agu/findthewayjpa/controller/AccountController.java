package com.agu.findthewayjpa.controller;


import com.agu.findthewayjpa.dtos.LoginDto;
import com.agu.findthewayjpa.dtos.RegisterDto;
import com.agu.findthewayjpa.services.UserService;
import com.agu.findthewayjpa.utils.Constant;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RequestMapping(Constant.apiVersion+"/account")
@RestController
public class AccountController {
    private final UserService authService;

    @PostMapping("register")
    public ResponseEntity<Object> register(@RequestBody @Valid RegisterDto data){
        return ResponseEntity.ok(authService.register(data));
    }

    @PostMapping("login")
    public ResponseEntity<Object> login(@RequestBody @Valid LoginDto data){
        return ResponseEntity.ok(authService.login(data));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("user")
    public ResponseEntity<Object> login(){

        return ResponseEntity.ok(authService.getCurrentUsername());
    }
}
