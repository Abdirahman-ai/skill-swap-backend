package com.skillSwap.skillSwap.entities;

import com.skillSwap.skillSwap.model.SessionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User teacher;

    @ManyToOne
    private User learner;

    @ManyToOne
    private Skill skill;

    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    private String feedback;
}
