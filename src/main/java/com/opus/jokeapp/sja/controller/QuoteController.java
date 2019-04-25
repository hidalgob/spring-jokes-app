package com.opus.jokeapp.sja.controller;

import com.opus.jokeapp.sja.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
    private JokeService jokeService;

    @Autowired
    public QuoteController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String sayQuote(Model model) {

        model.addAttribute("joke", jokeService.getString());

        return "chucknorris";
    }
}
