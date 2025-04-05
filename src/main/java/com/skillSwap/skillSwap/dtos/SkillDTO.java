package com.skillSwap.skillSwap.dtos;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDTO {
    private UUID id;
    private String name;
    private String category;
}
