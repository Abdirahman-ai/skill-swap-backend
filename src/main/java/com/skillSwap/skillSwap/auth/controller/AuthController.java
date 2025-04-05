package com.skillSwap.skillSwap.auth.controller;


import com.skillSwap.skillSwap.auth.dto.AuthRequest;
import com.skillSwap.skillSwap.auth.dto.AuthResponse;
import com.skillSwap.skillSwap.auth.dto.RegisterRequest;
import com.skillSwap.skillSwap.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
