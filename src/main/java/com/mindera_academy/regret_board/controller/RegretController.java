package com.mindera_academy.regret_board.controller;

import com.mindera_academy.regret_board.entity.Regret;
import com.mindera_academy.regret_board.repository.RegretRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/regrets")
public class RegretController {

    private final RegretRepository regretRepository;

    public RegretController(RegretRepository regretRepository) {
        this.regretRepository = regretRepository;
    }

    @PostMapping
    public Regret create(@RequestBody Regret regret) {
        return regretRepository.save(regret);
    }

    @GetMapping
    public List<Regret> all() {
        return regretRepository.findAll();
    }

    @GetMapping("/filter")
    public List<Regret> bySeverity(@RequestParam String severity) {
        return regretRepository.findBySeverity(severity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        regretRepository.deleteById(id);
    }
}
