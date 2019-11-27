package com.ing.graphql.marvel.service;

import com.ing.graphql.marvel.domain.Favourite;
import org.springframework.data.repository.CrudRepository;

public interface FavouriteRepository extends CrudRepository<Favourite, Integer> {}