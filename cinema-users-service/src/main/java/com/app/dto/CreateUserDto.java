package com.app.dto;

import com.app.model.enums.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserDto {
    private String username;
    private String password;
    private String passwordConfirmation;
    private RoleUser role;
}
