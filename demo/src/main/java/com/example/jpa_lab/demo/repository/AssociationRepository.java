package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
