package ru.wiki.dotainf.controller.hats;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeaderController {

    @GetMapping(value = {"/about", "/about/"})
    public String about() {
        return "header/about";
    }

    @GetMapping(value = {"", "/", "/heroes/"})
    public String redirectHeroes() {
        return "redirect:/heroes";
    }

}
