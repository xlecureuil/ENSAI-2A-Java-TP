package fr.ensai.running.service;

import fr.ensai.running.model.Competition;
import fr.ensai.running.repository.CompetitionRepository;
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
        competitionRepository.deleteById(id);
    }
}
