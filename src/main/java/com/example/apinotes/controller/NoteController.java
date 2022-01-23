package com.example.apinotes.controller;

import com.example.apinotes.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    int endpoint(@PathVariable("id") String idEtudiant){
        return noteService.claculNote(idEtudiant);
    }
}