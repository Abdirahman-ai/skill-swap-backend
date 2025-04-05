package com.skillSwap.skillSwap.repositories;

import com.skillSwap.skillSwap.entities.Skill;
import com.skillSwap.skillSwap.entities.User;
import com.skillSwap.skillSwap.entities.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository  // Optional, but nice for readability
public interface UserSkillRepository extends JpaRepository<UserSkill, UUID> {
    List<UserSkill> findByUser(User user);
    List<UserSkill> findBySkill(Skill skill);
}

