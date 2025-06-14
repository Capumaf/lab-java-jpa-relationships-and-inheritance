package com.example.jpa_lab.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Conference extends Event {

    @ManyToMany
    private List<Speaker> speakers;

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
