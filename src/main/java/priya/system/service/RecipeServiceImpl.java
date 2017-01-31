package priya.system.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import priya.system.domain.Recipe;
import priya.system.domain.RecipeType;


@Component("recipeService")
@Transactional
public class RecipeServiceImpl implements RecipeService {
	
	
	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl (RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;		
	}

	@Override
	public Optional<Recipe> getRecipe(String name, RecipeType recipeType) {
		return this.recipeRepository.findByNameAndRecipeType(name, recipeType);
	}

	@Override
	public Page<Recipe> getRecipes(Pageable pageable) {
		return this.recipeRepository.findAll(pageable);
	}

	@Override
	public Recipe addANewRecipe(Recipe recipe) {
		Assert.notNull(recipe, "Recipe must not be null");
		return this.recipeRepository.save(recipe);
	}
	
	
}
