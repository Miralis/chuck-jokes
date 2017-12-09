package com.example.chuckjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


public class ChuckConfiguration {
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
