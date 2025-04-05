package com.skillSwap.skillSwap.services;

import com.skillSwap.skillSwap.dtos.SkillDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SkillService {
    List<SkillDTO> getAllSkills();
    Optional<SkillDTO> getSkillById(UUID id);
    SkillDTO saveSkill(SkillDTO skillDTO);
    void deleteSkill(UUID id);
}
