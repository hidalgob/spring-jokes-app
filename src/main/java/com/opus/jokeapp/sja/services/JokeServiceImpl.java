package com.opus.jokeapp.sja.services;

import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getString() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
