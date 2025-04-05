package com.skillSwap.skillSwap.dtos;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private UUID id;
    private String username;
    private String email;
    private String bio;
    private String location;
    private Double rating;
    private String role;
}

