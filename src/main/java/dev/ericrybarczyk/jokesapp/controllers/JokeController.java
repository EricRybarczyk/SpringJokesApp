package dev.ericrybarczyk.jokesapp.controllers;

import dev.ericrybarczyk.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired // not required on ctor, but being explicit since this is a learning demo app
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String displayJoke(Model model) {
        model.addAttribute("joke", jokeService.tellJoke());
        return "chucknorris";
    }

}
