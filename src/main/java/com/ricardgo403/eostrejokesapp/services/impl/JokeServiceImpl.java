package com.ricardgo403.eostrejokesapp.services.impl;

import com.ricardgo403.eostrejokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/***
 * @author Copyright 2021 @ricardgo., All Rights Reserved.
 * Created on 4/19/21
 ***/
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
