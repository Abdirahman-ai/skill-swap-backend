package com.skillSwap.skillSwap.controllers;

import com.skillSwap.skillSwap.dtos.SessionDTO;
import com.skillSwap.skillSwap.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/sessions")
@CrossOrigin(origins = "http://localhost:4200")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<SessionDTO> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public Optional<SessionDTO> getSessionById(@PathVariable UUID id) {
        return sessionService.getSessionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable UUID id) {
        sessionService.deleteSession(id);
    }

    @PostMapping
    public ResponseEntity<SessionDTO> createSession(@RequestBody SessionDTO sessionDTO) {
        SessionDTO created = sessionService.createSession(sessionDTO);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

}
