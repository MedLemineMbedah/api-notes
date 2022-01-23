package com.example.apinotes;
import org.junit.jupiter.api.Test;
import com.example.apinotes.services.NoteService;

import static org.junit.jupiter.api.Assertions.assertTrue;
class TestService {
    NoteService noteService = new NoteService();
    @Test
    public void tester(){

        int note = noteService.claculNote("2");
        assertTrue(note<=20&note>=1,"true");
    }
}
