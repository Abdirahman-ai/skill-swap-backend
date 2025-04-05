package com.skillSwap.skillSwap.repositories;


import com.skillSwap.skillSwap.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository  // Optional, but nice for readability
public interface SkillRepository extends JpaRepository<Skill, UUID> {
    Optional<Skill> findByName(String skillName);
}

