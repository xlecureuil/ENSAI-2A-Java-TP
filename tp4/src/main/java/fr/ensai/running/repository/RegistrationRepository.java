package fr.ensai.running.repository;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.model.Competition;
import fr.ensai.running.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    // Trouver une inscription à partir d’un athlète et d’une compétition
    Registration findByAthleteAndCompetition(Athlete athlete, Competition competition);

    // Trouver les ID des athlètes inscrits à une compétition donnée
    @Query("SELECT r.athlete.id FROM Registration r WHERE r.competition.id = :idCompetition")
    List<Long> findAthleteIdByCompetitionId(Long idCompetition);

    // Trouver toutes les inscriptions liées à une compétition
    List<Registration> findByCompetitionId(Long competitionId);

    // Supprimer une inscription à partir de l’athlète et de la compétition
    void deleteByCompetitionIdAndAthleteId(Long competitionId, Long athleteId);
}
