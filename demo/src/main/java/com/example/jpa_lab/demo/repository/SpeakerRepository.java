package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
