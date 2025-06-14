package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
