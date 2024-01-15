package com.rl5.apiusers.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rl5.apiusers.dtos.request.NewUserRequestDTO;
import com.rl5.apiusers.dtos.request.RefreshTokenRequestDTO;
import com.rl5.apiusers.dtos.request.UserLoginRequestDTO;
import com.rl5.apiusers.dtos.response.TokenResponseDTO;
import com.rl5.apiusers.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
@Validated
public class UsersController {

    private final UserService userService;

    @PostMapping("/users/register")
    public TokenResponseDTO register(@RequestBody @Valid  NewUserRequestDTO request) {
        return userService.register(request);
    }

    @PostMapping("/users/login")
    public TokenResponseDTO login(@RequestBody UserLoginRequestDTO request) {
        return userService.login(request);
    }

    @PostMapping("/users/token")
    public TokenResponseDTO refreshToken(@RequestBody RefreshTokenRequestDTO request){
        return userService.refreshConnection(request.getRefreshToken());
    }
    

}
