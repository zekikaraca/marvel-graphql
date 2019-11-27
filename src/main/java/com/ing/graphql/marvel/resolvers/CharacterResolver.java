package com.ing.graphql.marvel.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ing.graphql.marvel.domain.Character;
import com.ing.graphql.marvel.domain.Serie;
import com.ing.graphql.marvel.service.FavouriteService;
import com.ing.graphql.marvel.service.MarvelService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CharacterResolver implements GraphQLResolver<Character> {

    private MarvelService marvelService;

    private FavouriteService favouriteService;

    public CharacterResolver(MarvelService marvelService, FavouriteService favouriteService) {
        this.marvelService = marvelService;
        this.favouriteService = favouriteService;
    }

    public List<Serie> getSeriesList(final Character character) throws IOException {
        return this.marvelService.getSeries(character.getId());
    }

    public boolean isFavourite(final Character character) { return this.favouriteService.isFavourite(character.getId()); }

}
