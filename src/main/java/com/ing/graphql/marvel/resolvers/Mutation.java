package com.ing.graphql.marvel.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.ing.graphql.marvel.domain.Favourite;
import com.ing.graphql.marvel.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private FavouriteService favouriteService;

    public Favourite addFavourite(final int characterId) {

        Favourite favourite = Favourite.builder()
                .characterId(characterId)
                .build();

        return favouriteService.addFavourite(favourite);
    }

    public void delFavourite(final int characterId) { favouriteService.delFavourite(characterId); }

    public List<Favourite> getAllFavourites() {
        return favouriteService.getAllFavourites();
    }

}