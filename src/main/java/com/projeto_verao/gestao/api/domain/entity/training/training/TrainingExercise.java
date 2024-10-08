package com.projeto_verao.gestao.api.domain.entity.training.training;

import com.projeto_verao.gestao.api.domain.entity.exercise.Exercise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "training_exercises")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    private int order;
    private int sets;
    private int repetitions;
}
