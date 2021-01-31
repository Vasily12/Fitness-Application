package com.example.fitnessapp;


import com.example.fitnessapp.model.Workout;
import com.example.fitnessapp.repository.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBRunner implements CommandLineRunner 
{
	@Autowired
	private WorkoutRepository workoutRepository;
	
	/* Essentially when the application back end runs, this also runs with it,
	 * What this does is deletes all the saved data in the database,
	 * Then saves a new work out in the database using the back end side (which is here in Eclipse, instead of 
	 * in the front end where the user is given the choice to add one) for testing purposes
	 */ 
	@Override
	public void run(String... args) throws Exception {
		
		workoutRepository.deleteAll();
		
		workoutRepository.save(new Workout("Arnold Shoulder Press", "very common shoulder exercise as its name", "https://www.youtube.com/watch?v=vj2w851ZHRM"));
		
		workoutRepository.save(new Workout("Test", "Test description", "Test youtube link"));
	}

}
