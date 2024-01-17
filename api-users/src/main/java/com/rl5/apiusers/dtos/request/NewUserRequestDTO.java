package com.rl5.apiusers.dtos.request;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
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
public class NewUserRequestDTO implements Serializable {

    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String nickname;

}
