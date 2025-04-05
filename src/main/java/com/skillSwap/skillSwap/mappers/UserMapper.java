package com.skillSwap.skillSwap.mappers;


import com.skillSwap.skillSwap.dtos.UserDTO;
import com.skillSwap.skillSwap.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User fromDTO(UserDTO userDTO);
}
