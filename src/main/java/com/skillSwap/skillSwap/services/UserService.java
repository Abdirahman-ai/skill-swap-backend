package com.skillSwap.skillSwap.services;


import com.skillSwap.skillSwap.dtos.UserDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(UUID id);
    UserDTO saveUser(UserDTO userDTO);
    void deleteUser(UUID id);
}
