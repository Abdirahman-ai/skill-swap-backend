package com.skillSwap.skillSwap.mappers;


import com.skillSwap.skillSwap.dtos.SkillDTO;
import com.skillSwap.skillSwap.entities.Skill;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDTO toDTO(Skill skill);
    Skill fromDTO(SkillDTO skillDTO);
}

