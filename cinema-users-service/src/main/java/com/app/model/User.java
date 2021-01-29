package com.app.model;

import com.app.model.enums.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
//    private String passwordConfirmation;
    @Enumerated(EnumType.STRING)
    private RoleUser role;


}
