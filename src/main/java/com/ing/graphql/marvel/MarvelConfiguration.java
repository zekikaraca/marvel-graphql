package com.ing.graphql.marvel;

import com.ing.graphql.marvel.directives.UppercaseDirective;
import com.oembedler.moon.graphql.boot.SchemaDirective;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MarvelConfiguration {

    @Bean
    public SchemaDirective upperCaseDirective() {
        return new SchemaDirective("uppercase", new UppercaseDirective());
    }

}
