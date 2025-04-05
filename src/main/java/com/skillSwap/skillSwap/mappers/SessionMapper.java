package com.skillSwap.skillSwap.mappers;


import com.skillSwap.skillSwap.dtos.SessionDTO;
import com.skillSwap.skillSwap.entities.Session;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface SessionMapper {

    @Mapping(source = "teacher.username", target = "teacherUsername")
    @Mapping(source = "learner.username", target = "learnerUsername")
    @Mapping(source = "skill.name", target = "skillName")
    @Mapping(source = "status", target = "status")
    SessionDTO toDTO(Session session);

    // If you ever need reverse mapping, you can add a method like:
    // Session fromDTO(SessionDTO dto); ← requires lookup services or custom resolver
}
