package com.agu.findthewayjpa.repositories;

import com.agu.findthewayjpa.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query(value = "SELECT * FROM messages", nativeQuery = true)
    List<Message> getMessages();
}
