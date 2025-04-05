package com.skillSwap.skillSwap.dtos;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {
    private UUID id;
    private String teacherUsername;
    private String learnerUsername;
    private String skillName;
    private LocalDateTime dateTime;
    private String status;
    private String feedback;
}
