package com.skillSwap.skillSwap.repositories;

import com.skillSwap.skillSwap.entities.Session;
import com.skillSwap.skillSwap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository  // Optional, but nice for readability
public interface SessionRepository extends JpaRepository<Session, UUID> {
    List<Session> findByTeacher(User teacher);
    List<Session> findByLearner(User learner);
}
