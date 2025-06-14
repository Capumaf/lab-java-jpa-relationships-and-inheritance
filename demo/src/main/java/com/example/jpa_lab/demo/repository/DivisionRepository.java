package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DivisionRepository extends JpaRepository<Division, Long> {
    List<Division> findByDistrict(String district);
}
