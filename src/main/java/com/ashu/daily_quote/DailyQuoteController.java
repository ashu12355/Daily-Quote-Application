package com.ashu.daily_quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DailyQuoteController {

    
    private final DailyQuoteService service;

    public DailyQuoteController(DailyQuoteService service) {
        this.service = service;
    }


    @GetMapping
    public String home(Model model){

        model.addAttribute("quote", service.getQuote());
        return "index";
    }


}
