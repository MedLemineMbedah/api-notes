package com.example.apinotes;

import com.example.apinotes.controller.NoteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NoteController.class)
public class IntegrationTest {

    @Autowired
    private MockMvc mvc;
    @Test
    public void getNot() throws Exception
    {
        mvc.perform(get("/note"))
                .andExpect(status().isAccepted());    }


}
