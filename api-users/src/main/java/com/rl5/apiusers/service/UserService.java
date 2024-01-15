package com.rl5.apiusers.service;

import com.rl5.apiusers.dtos.request.NewUserRequestDTO;
import com.rl5.apiusers.dtos.request.UserLoginRequestDTO;
import com.rl5.apiusers.dtos.response.TokenResponseDTO;

public interface UserService {

    TokenResponseDTO register(NewUserRequestDTO newUser);
    TokenResponseDTO login(UserLoginRequestDTO login);
    TokenResponseDTO refreshConnection(String refreshToken);
    

}
