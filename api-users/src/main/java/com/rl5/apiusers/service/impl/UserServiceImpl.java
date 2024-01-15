package com.rl5.apiusers.service.impl;

import org.springframework.stereotype.Service;

import com.rl5.apiusers.dtos.request.NewUserRequestDTO;
import com.rl5.apiusers.dtos.request.UserLoginRequestDTO;
import com.rl5.apiusers.dtos.response.TokenResponseDTO;
import com.rl5.apiusers.service.UserService;
import com.rl5.apiusers.utils.JWTUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final JWTUtils jwtUtils;

    @Override
    public TokenResponseDTO register(NewUserRequestDTO newUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public TokenResponseDTO login(UserLoginRequestDTO login) {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public TokenResponseDTO refreshConnection(String refreshToken) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refreshToken'");
    }

}
