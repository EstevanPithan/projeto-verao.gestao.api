package com.projeto_verao.gestao.api.domain.repositories;

import com.projeto_verao.gestao.api.domain.entity.exercise.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciseRepository extends JpaRepository<Exercise, UUID> {
}