package com.rl5.apiusers.dtos.request;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
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
public class UserLoginRequestDTO implements Serializable{

    @NotBlank
    private String username;
    @NotBlank
    private String password;

}
