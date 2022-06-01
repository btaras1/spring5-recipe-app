package com.guru.receipts.controllers;

import com.guru.receipts.domain.Category;
import com.guru.receipts.domain.Recipe;
import com.guru.receipts.domain.UnitOfMeasure;
import com.guru.receipts.repositories.CategoryRepository;
import com.guru.receipts.repositories.UnitOfMeasureRepository;
import com.guru.receipts.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
