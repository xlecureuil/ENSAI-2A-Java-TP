package fr.ensai.running.controller;

import fr.ensai.running.model.Competition;
import fr.ensai.running.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    /**
     * Display all competitions
     */
    @GetMapping
    public String allCompetitions(Model model) {
        List<Competition> competitions = competitionService.findAll();
        model.addAttribute("competitions", competitions);
        return "allCompetitions"; // refers to allCompetitions.html
    }

    /**
     * Delete a competition by id
     */
    @GetMapping("/delete/{id}")
    public String deleteCompetition(@PathVariable Long id) {
        competitionService.deleteById(id);
        return "redirect:/competition";
    }
}