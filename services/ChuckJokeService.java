package com.example.chuckjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokeService implements JokeService{

    private final ChuckNorrisQuotes quotes;

    public ChuckJokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return quotes.getRandomQuote();
    }
}
