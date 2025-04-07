package com.mindera_academy.regret_board.repository;

import com.mindera_academy.regret_board.entity.Regret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegretRepository extends JpaRepository<Regret, Long> {
    List<Regret> findBySeverity(String severity);
}