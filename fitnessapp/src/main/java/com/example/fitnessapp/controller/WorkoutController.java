package com.example.fitnessapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitnessapp.model.Workout;
import com.example.fitnessapp.repository.WorkoutRepository;



@RestController
@RequestMapping("/")
public class WorkoutController 
{
	@Autowired
	WorkoutRepository workoutRepository;
	
	
	// GET request for getting all workouts in the database
//	@GetMapping("/workouts")
	@RequestMapping(method=RequestMethod.GET, value="/workouts")
	public List<Workout> getAllWorkouts()
	{
		return workoutRepository.findAll();
	}
	// GET request for getting a single workout
	@GetMapping("/workouts/{id}")
	public Workout getWorkoutById(@PathVariable(value = "id") Long workoutId)
	{
		return workoutRepository.findById(workoutId).orElseThrow(RuntimeException::new);
	}
	
	// Does work
	@GetMapping("/test")
	public String GetTest()
	{
		return "Testing if controller works...";
	}
	
	// For now use DB runner to add workouts to the database
}
