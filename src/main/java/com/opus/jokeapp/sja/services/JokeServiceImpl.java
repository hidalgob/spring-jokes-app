package com.opus.jokeapp.sja.services;

import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getString() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
