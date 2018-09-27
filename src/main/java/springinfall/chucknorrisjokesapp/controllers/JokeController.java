package springinfall.chucknorrisjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springinfall.chucknorrisjokesapp.services.JokeService;

@Controller
public class JokeController {

    private JokeService quoteService;

    public JokeController(JokeService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", quoteService.getJoke());
        return "chucknorris";
    }
}
