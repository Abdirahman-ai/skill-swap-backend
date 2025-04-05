package com.skillSwap.skillSwap.repositories;

import com.skillSwap.skillSwap.entities.Message;
import com.skillSwap.skillSwap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository  // Optional, but nice for readability
public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> findBySender(User sender);
    List<Message> findByReceiver(User receiver);
}

