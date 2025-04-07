package fr.ensai.running.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Athlete athlete;

    @ManyToOne
    private Competition competition;

    @Override
    public String toString() {
        return "Registration (" + athlete + " -> " + competition + ")";
    }
}
