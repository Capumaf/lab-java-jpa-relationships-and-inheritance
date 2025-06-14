package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Guest;
import com.example.jpa_lab.demo.entity.GuestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByStatus(GuestStatus status);
}
