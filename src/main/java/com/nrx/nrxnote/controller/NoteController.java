package com.nrx.nrxnote.controller;

import co.elastic.clients.elasticsearch.nodes.Http;
import com.nrx.nrxnote.dto.NoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("noteRequest", new NoteRequest());
        return "index";
    }

    @PostMapping("/home")
    @ResponseBody
    public HttpStatus save(@ModelAttribute NoteRequest noteRequest){
        System.out.println(noteRequest.getNoteHeader());
        System.out.println(noteRequest.getNoteMessage());
        return HttpStatus.OK;
    }
}
