package com.rl5.apiusers.dtos.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TokenResponseDTO implements Serializable{

    private String accessToken;
    private String refreshToken;
    private Long expiresIn;

}
