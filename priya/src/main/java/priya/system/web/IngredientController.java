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
import priya.system.domain.IngredientType;
import priya.system.service.IngredientService;

@RestController
@RequestMapping("ingredient")
public class IngredientController {
		
	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping("/all")
	@Transactional(readOnly = true)
	public Page<Ingredient> getIngredients() {
		Pageable pageRequest = createPageRequest();
		return ingredientService.getIngredients(pageRequest);
	}
	
	@PutMapping("/add")
	public Ingredient addANewIngredient(@RequestParam("name") String name, @RequestParam("ingredientType") String ingredientType, @RequestParam("brand") String brand) {
		Ingredient ingredient = new Ingredient(name, IngredientType.valueOf(ingredientType.toUpperCase()), brand);
		return ingredientService.addANewIngredient(ingredient);
	}
	
	// TODO get all recipes containing ingredient X
	
	private Pageable createPageRequest() {
		return new PageRequest(0, 10, Sort.Direction.ASC, "name");
	}
	
}
