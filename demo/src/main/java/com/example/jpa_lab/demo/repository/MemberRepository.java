package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Member;
import com.example.jpa_lab.demo.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByStatus(Status status);
}
