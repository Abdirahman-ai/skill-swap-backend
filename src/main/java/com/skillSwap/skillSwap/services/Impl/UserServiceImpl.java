package com.skillSwap.skillSwap.services.Impl;

import com.skillSwap.skillSwap.dtos.UserDTO;
import com.skillSwap.skillSwap.entities.User;
import com.skillSwap.skillSwap.mappers.UserMapper;
import com.skillSwap.skillSwap.repositories.UserRepository;
import com.skillSwap.skillSwap.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepo.findAll().stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserDTO> getUserById(UUID id) {
        return userRepo.findById(id)
                .map(userMapper::toDTO);
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = userMapper.fromDTO(userDTO);
        return userMapper.toDTO(userRepo.save(user));
    }

    @Override
    public void deleteUser(UUID id) {
        userRepo.deleteById(id);
    }
}
