package com.skillSwap.skillSwap.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    private String content;
    private LocalDateTime timestamp;
}
