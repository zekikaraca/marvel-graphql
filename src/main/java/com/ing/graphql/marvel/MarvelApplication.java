package com.ing.graphql.marvel;

import com.ing.graphql.marvel.directives.UppercaseDirective;
import com.oembedler.moon.graphql.boot.SchemaDirective;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}

}
