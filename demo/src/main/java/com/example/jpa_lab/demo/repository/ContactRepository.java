package com.example.jpa_lab.demo.repository;

import com.example.jpa_lab.demo.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
