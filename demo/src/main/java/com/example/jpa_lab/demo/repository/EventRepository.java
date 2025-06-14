package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
