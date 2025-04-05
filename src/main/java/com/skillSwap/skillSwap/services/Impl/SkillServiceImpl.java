package com.skillSwap.skillSwap.services.Impl;

import com.skillSwap.skillSwap.dtos.SkillDTO;
import com.skillSwap.skillSwap.entities.Skill;
import com.skillSwap.skillSwap.mappers.SkillMapper;
import com.skillSwap.skillSwap.repositories.SkillRepository;
import com.skillSwap.skillSwap.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepo;

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public List<SkillDTO> getAllSkills() {
        return skillRepo.findAll().stream()
                .map(skillMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SkillDTO> getSkillById(UUID id) {
        return skillRepo.findById(id)
                .map(skillMapper::toDTO);
    }

    @Override
    public SkillDTO saveSkill(SkillDTO skillDTO) {
        Skill skill = skillMapper.fromDTO(skillDTO);
        return skillMapper.toDTO(skillRepo.save(skill));
    }

    @Override
    public void deleteSkill(UUID id) {
        skillRepo.deleteById(id);
    }
}
