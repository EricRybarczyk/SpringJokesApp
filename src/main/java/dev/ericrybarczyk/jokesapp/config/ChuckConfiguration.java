package dev.ericrybarczyk.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration // changed to XML-based configuration for demo purposes
public class ChuckConfiguration {

    //@Bean // changed to XML-based configuration
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
