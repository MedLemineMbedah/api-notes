package com.example.apinotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class NoteController {

    @GetMapping("/notes")
    int endpoint(@PathVariable("id") String idEtudiant){
        Random random = new Random();
        int nb = random.nextInt(1-20);
        return nb;
    }
}