package priya.system.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import priya.system.domain.Ingredient;
import priya.system.domain.Recipe;


interface IngredientRepository extends Repository<Ingredient, Long>{
	
	Page<Ingredient> findByRecipes(Recipe recipes, Pageable pageable);
	
	Page<Ingredient> findAll(Pageable pageable);
	
	Ingredient save(Ingredient ingredient);
	
}
