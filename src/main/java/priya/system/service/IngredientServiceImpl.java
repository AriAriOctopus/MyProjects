package priya.system.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import priya.system.domain.Ingredient;
import priya.system.domain.Recipe;


@Component("ingredientService")
@Transactional
public class IngredientServiceImpl implements IngredientService {
	
	private final IngredientRepository ingredientRepository;
	
	public IngredientServiceImpl(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Page<Ingredient> getRecipeIngredients(Recipe recipes, Pageable pageable) {
		return this.ingredientRepository.findByRecipes(recipes, pageable);
	}

	@Override
	public Page<Ingredient> getIngredients(Pageable pageable) {
		return this.ingredientRepository.findAll(pageable);
	}

	@Override
	public Ingredient addANewIngredient(Ingredient Ingredient) {
		return this.ingredientRepository.save(Ingredient);
	}	


}
