package com.nrx.nrxnote.controller;

import com.nrx.nrxnote.dto.NoteRequest;
import com.nrx.nrxnote.entity.Note;
import com.nrx.nrxnote.repository.NoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("noteRequest", new NoteRequest());
        return "index";
    }

    @PostMapping("/home")
    @ResponseBody
    public HttpStatus save(@ModelAttribute NoteRequest noteRequest){
        Note note = new Note();
        note.setNoteHeader(noteRequest.getNoteHeader());
        note.setNoteMessage(noteRequest.getNoteMessage());
        noteRepository.save(note);
        return HttpStatus.OK;
    }
}
