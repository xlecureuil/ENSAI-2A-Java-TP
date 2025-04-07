package fr.ensai.running.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competition")
    private Long id;

    private String designation;
    private String city;

    @Column(name = "event_date")
    private LocalDate eventDate;

    private float distance;

    @Column(name = "max_athletes")
    private int maxAthletes;

    @Override
    public String toString() {
        return "Competition (" + designation + " in " + city + " on " + eventDate + ")";
    }
}
