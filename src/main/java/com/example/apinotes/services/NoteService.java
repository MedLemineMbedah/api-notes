package com.example.apinotes.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Service
public class NoteService {


    public int claculNote(@PathVariable("id") String idEtudiant){
        Random random = new Random();
        int nb = random.nextInt(1-20);
        return nb;
    }
}
