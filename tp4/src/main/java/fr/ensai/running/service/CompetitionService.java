package fr.ensai.running.service;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.model.Competition;
import fr.ensai.running.model.Registration;
import fr.ensai.running.repository.AthleteRepository;
import fr.ensai.running.repository.CompetitionRepository;
import fr.ensai.running.repository.RegistrationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;

    public List<Competition> findAll() {
        return competitionRepository.findAll();
    }

    public Competition findById(Long id) {
        return competitionRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        // Supprimer les inscriptions liées à cette compétition
        List<Registration> registrations = registrationRepository.findByCompetitionId(id);
        registrationRepository.deleteAll(registrations);
    
        // Supprimer la compétition
        competitionRepository.deleteById(id);
    }
    
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private AthleteRepository athleteRepository;

    /**
     * Trouve les athlètes inscrits à une compétition
     */
    public List<Athlete> findRegisteredAthletes(Long idCompetition) {
        List<Long> athleteIds = registrationRepository.findAthleteIdByCompetitionId(idCompetition);
        return athleteRepository.findAllById(athleteIds);
    }

    /**
     * Supprime l'inscription d'un athlète à une compétition
     */
    public void deleteRegistration(Long idCompetition, Long idAthlete) {
        registrationRepository.deleteByCompetitionIdAndAthleteId(idCompetition, idAthlete);
    }

}
