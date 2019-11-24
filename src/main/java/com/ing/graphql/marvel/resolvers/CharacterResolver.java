package com.ing.graphql.marvel.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ing.graphql.marvel.domain.Character;
import com.ing.graphql.marvel.domain.Serie;
import com.ing.graphql.marvel.service.MarvelService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CharacterResolver implements GraphQLResolver<Character> {

    private MarvelService marvelService;

    public CharacterResolver(MarvelService marvelService) {
        this.marvelService = marvelService;
    }

    public List<Serie> getSeriesList(final Character character, final int id) throws IOException {
        return this.marvelService.getSeries(id);
    }

}
