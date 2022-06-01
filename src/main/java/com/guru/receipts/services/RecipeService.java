package com.guru.receipts.services;

import com.guru.receipts.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
