package com.skillSwap.skillSwap.services.Impl;

import com.skillSwap.skillSwap.dtos.SessionDTO;
import com.skillSwap.skillSwap.entities.Session;
import com.skillSwap.skillSwap.entities.Skill;
import com.skillSwap.skillSwap.entities.User;
import com.skillSwap.skillSwap.mappers.SessionMapper;
import com.skillSwap.skillSwap.model.SessionStatus;
import com.skillSwap.skillSwap.repositories.SessionRepository;
import com.skillSwap.skillSwap.repositories.SkillRepository;
import com.skillSwap.skillSwap.repositories.UserRepository;
import com.skillSwap.skillSwap.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SessionMapper sessionMapper;



    @Override
    public List<SessionDTO> getAllSessions() {
        return sessionRepository.findAll().stream()
                .map(sessionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SessionDTO> getSessionById(UUID id) {
        return sessionRepository.findById(id)
                .map(sessionMapper::toDTO);
    }

    @Override
    public void deleteSession(UUID id) {
        sessionRepository.deleteById(id);
    }

    @Override
    public SessionDTO createSession(SessionDTO dto) {
        User teacher = userRepository.findByUsername(dto.getTeacherUsername())
                .orElseThrow(() -> new RuntimeException("Teacher not found"));

        User learner = userRepository.findByUsername(dto.getLearnerUsername())
                .orElseThrow(() -> new RuntimeException("Learner not found"));

        Skill skill = skillRepository.findByName(dto.getSkillName())
                .orElseThrow(() -> new RuntimeException("Skill not found"));

        Session session = new Session();
//        session.setId(dto.getId());
        session.setTeacher(teacher);
        session.setLearner(learner);
        session.setSkill(skill);
        session.setDateTime(dto.getDateTime());
        session.setStatus(SessionStatus.valueOf(dto.getStatus()));
        session.setFeedback(dto.getFeedback());

        Session saved = sessionRepository.save(session);
        return sessionMapper.toDTO(saved); // ✅ keep toDTO here
    }
}
