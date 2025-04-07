package fr.ensai.running.repository;

import fr.ensai.running.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
