package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {
}
