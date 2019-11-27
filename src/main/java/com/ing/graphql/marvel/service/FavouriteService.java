package com.ing.graphql.marvel.service;

import com.google.common.collect.Lists;
import com.ing.graphql.marvel.domain.Favourite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteService {

    @Autowired
    private FavouriteRepository favouriteRepository;

    public List<Favourite> getAllFavourites() { return Lists.newArrayList(favouriteRepository.findAll()); }

    public boolean isFavourite(int characterId) { return favouriteRepository.existsById(characterId); }

    public Favourite addFavourite(Favourite favourite) { return favouriteRepository.save(favourite); }
    
    public void delFavourite(int characterId) { favouriteRepository.deleteById(characterId); }
}