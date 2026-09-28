package com.example.userservice.model;

import com.example.userservice.enums.Role;
import com.example.userservice.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id ;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role ;

    @Enumerated(EnumType.STRING)
    private Status status ;

    private String licenseNumber;

    private LocalDateTime createdAt ;


}
