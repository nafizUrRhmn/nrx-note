package com.nrx.nrxnote.controller;

import com.nrx.nrxnote.dto.NoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("noteRequest", new NoteRequest());
        return "index";
    }

    @PostMapping("/home")
    public String save(@ModelAttribute NoteRequest noteRequest){
        System.out.println(noteRequest.getNoteHeader());
        System.out.println(noteRequest.getNoteMessage());
        return "index";
    }
}
