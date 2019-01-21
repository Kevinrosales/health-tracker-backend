package com.kevinrosales.healthtrackerbackend;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    @Autowired
    private ExerciseRepository exerciseRepo;

//    @PostMapping(value = "/exercises")
//    public Exercise addExercise(@RequestParam String title, @RequestParam String quantity, @RequestParam String description) {
//
//    }

    @GetMapping(value = "/exercises")
    public String getExercises() {
        Gson gson = new Gson();
        String JsonExercise = gson.toJson(exerciseRepo.findAll());
        return JsonExercise;
    }



}
