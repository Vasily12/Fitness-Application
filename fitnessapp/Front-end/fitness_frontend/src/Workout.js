import React, { useEffect, useState} from 'react';
import axios from 'axios';


function GetWorkoutInfo()
{
    const [info, setInfo] = useState("");

    const handleSubmit = event => {
        event.preventDefault();
        

        // axios.get("workouts").then(res => 
        // Sort of works but returns an array that includes 2 elements that have empty properties
        // Basically returns "[ { "name": "", "description": "", "videoLink" : ""}, {} ]"
        axios.get("workouts").then(res =>
            { 
                console.log(res);
                var chosenWorkout = res.data[0];
                setInfo(chosenWorkout.name);
                console.log("Workout list: " + res.data);
                console.log("Workout info: " + chosenWorkout.name);
                console.log("Workout description:  " + chosenWorkout.description);
            }).catch(res => {
                console.log("if there are errors: " + res);
            });
    }


    return <div>

        <button onClick={handleSubmit}>
            Load Workout info
        </button>
        <input type="text" name="workoutId" value="0"></input>
        <p>
            Workout: {info}
        </p>
    </div>
}

export default GetWorkoutInfo;
