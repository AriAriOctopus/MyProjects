package priya.system.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import priya.system.domain.Ingredient;
import priya.system.domain.Recipe;
import priya.system.domain.RecipeType;
import priya.system.service.IngredientService;
import priya.system.service.RecipeService;

@RestController
@RequestMapping("recipe")
public class RecipeController {	

	@Autowired
	private RecipeService recipeService;	
	
	@Autowired
	private IngredientService ingredientService;

	@GetMapping("/")
	@Transactional(readOnly = true)
	public Page<Ingredient> getRecipeIngredients(@RequestParam("name") String name, @RequestParam("recipeType") String recipeType) {	
		Pageable pageRequest = createPageRequest();
		Recipe recipe = recipeService.getRecipe(name, RecipeType.valueOf(recipeType.toUpperCase())).get();
		return ingredientService.getRecipeIngredients(recipe, pageRequest);
	}
	
	@GetMapping("/all")
	@Transactional(readOnly = true)
	public Page<Recipe> getRecipes() {
		Pageable pageRequest = createPageRequest();
		return recipeService.getRecipes(pageRequest);
	}
	
	@PutMapping("/add")
	public Recipe addANewRecipe(@RequestParam("name") String name, @RequestParam("recipeType") String recipeType) {
		Recipe recipe = new Recipe(name, RecipeType.valueOf(recipeType.toUpperCase()));
		return recipeService.addANewRecipe(recipe);
	}
	
	private Pageable createPageRequest() {
		return new PageRequest(0, 10, Sort.Direction.ASC, "name");
	}
	
}
