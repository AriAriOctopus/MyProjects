package priya.system.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import priya.system.domain.Ingredient;
import priya.system.domain.Recipe;

public interface IngredientService {
	
	Page<Ingredient> getRecipeIngredients(Recipe recipe, Pageable pageable);	
	
	Page<Ingredient> getIngredients(Pageable pageable);
	
	Ingredient addANewIngredient(Ingredient Ingredient);
	
}
