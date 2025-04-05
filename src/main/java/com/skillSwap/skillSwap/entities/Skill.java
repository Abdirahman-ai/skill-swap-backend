package com.skillSwap.skillSwap.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String category;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private List<UserSkill> userSkills = new ArrayList<>();
}
