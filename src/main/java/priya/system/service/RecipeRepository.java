package priya.system.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


import priya.system.domain.Recipe;
import priya.system.domain.RecipeType;

interface RecipeRepository extends Repository<Recipe, Long>{
	
	Optional<Recipe> findByNameAndRecipeType(String name, RecipeType recipeType);
	
	Page<Recipe> findAll(Pageable pageable);
	
	Recipe save(Recipe recipe);

}