package com.ashu.daily_quote;

import org.springframework.stereotype.Service;

@Service
public class DailyQuoteService { 
    private final DailyQuoteRepo repository;
    
    public  DailyQuoteService(DailyQuoteRepo repository) {
        this.repository = repository;
    }

    public String getQuote() {
        var quotes = repository.getQuotes();
        int randomIndex = (int)(Math.floor(Math.random()*quotes.length));
        return quotes[randomIndex];
    }


}
