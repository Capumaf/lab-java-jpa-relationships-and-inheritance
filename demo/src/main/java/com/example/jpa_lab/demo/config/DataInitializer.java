package com.example.jpa_lab.demo.config;

import com.example.jpa_lab.demo.entity.*;
import com.example.jpa_lab.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(
            ContactRepository contactRepo,
            AssociationRepository associationRepo,
            MemberRepository memberRepo,
            DivisionRepository divisionRepo,
            GuestRepository guestRepo,
            SpeakerRepository speakerRepo,
            EventRepository eventRepo,
            ConferenceRepository conferenceRepo,
            ExhibitionRepository exhibitionRepo
    ) {
        return args -> {

            // 1. Contact con Name embebido
            Name name = new Name();
            name.setSalutation("Mr.");
            name.setFirstName("Juan");
            name.setMiddleName("Carlos");
            name.setLastName("Pérez");

            Contact contact = new Contact();
            contact.setCompany("Tech PR");
            contact.setTitle("Manager");
            contact.setName(name);
            contactRepo.save(contact);

            // 2. Asociación con divisiones y miembros
            Member pres = new Member();
            pres.setName("Ana");
            pres.setStatus(Status.ACTIVE);
            pres.setRenewalDate(LocalDate.of(2025, 1, 1));
            memberRepo.save(pres);

            Member member = new Member();
            member.setName("Luis");
            member.setStatus(Status.LAPSED);
            member.setRenewalDate(LocalDate.of(2024, 5, 1));
            memberRepo.save(member);

            Division div = new Division();
            div.setName("Central Division");
            div.setDistrict("Madrid");
            div.setPresident(pres);
            div.setMembers(List.of(member, pres));
            divisionRepo.save(div);

            Association association = new Association();
            association.setName("Nurse Association of Spain");
            association.setDivisions(List.of(div));
            associationRepo.save(association);

            // 3. Event - Conference con Guest y Speaker
            Guest guest1 = new Guest();
            guest1.setName("Carla");
            guest1.setStatus(GuestStatus.ATTENDING);
            guestRepo.save(guest1);

            Speaker speaker1 = new Speaker();
            speaker1.setName("Dr. Smith");
            speaker1.setPresentationDuration(45);
            speakerRepo.save(speaker1);

            Conference conf = new Conference();
            conf.setTitle("Health Tech 2025");
            conf.setDate(LocalDate.of(2025, 6, 20));
            conf.setDuration(2);
            conf.setLocation("Barcelona");
            conf.setGuests(List.of(guest1));
            conf.setSpeakers(List.of(speaker1));
            conferenceRepo.save(conf);
        };
    }
}
