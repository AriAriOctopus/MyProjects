package priya.system.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import priya.system.domain.Recipe;
import priya.system.domain.RecipeType;

public interface RecipeService {

	Optional<Recipe> getRecipe(String name, RecipeType recipeType);
	
	Page<Recipe> getRecipes(Pageable pageable);
	
	Recipe addANewRecipe(Recipe recipe);
	
}
