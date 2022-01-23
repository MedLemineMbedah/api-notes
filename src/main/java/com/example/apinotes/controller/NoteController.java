package com.example.apinotes.controller;

import com.example.apinotes.persistance.model.note;
import com.example.apinotes.persistance.repository.JPARepository;
import com.example.apinotes.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;
    @Autowired
    private JPARepository repo;



    @GetMapping("/notes")
    int endpoint(@PathVariable("id") String idEtudiant){
        note n=repo.get(idEtudiant);
        if(n!=null){
            return n.getValeur();
        }
        n.setIdEtudiant(idEtudiant);
        n.setValeur(noteService.claculNote(idEtudiant));
        repo.save(n);
        return n.getValeur();
    }


    @PostMapping("/notes")
    public void suavagrder(note n) {
        repo.save(n);
    }
}