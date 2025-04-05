package com.skillSwap.skillSwap.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String email;
    private String password;
    private String bio;
    private String location;
    private Double rating;
    private String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserSkill> userSkills = new ArrayList<>();

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Session> sessionsTeaching = new ArrayList<>();

    @OneToMany(mappedBy = "learner", cascade = CascadeType.ALL)
    private List<Session> sessionsLearning = new ArrayList<>();
}

