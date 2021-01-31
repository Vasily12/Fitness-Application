package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long>
{

}
