package com.skillSwap.skillSwap.services;

import com.skillSwap.skillSwap.dtos.SessionDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SessionService {
    List<SessionDTO> getAllSessions();
    Optional<SessionDTO> getSessionById(UUID id);
    void deleteSession(UUID id);

    SessionDTO createSession(SessionDTO sessionDTO);
}
