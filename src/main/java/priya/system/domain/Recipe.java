package priya.system.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Recipe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private RecipeType recipeType;
	
	@Column
	private String recipeMethod;
	
	@Column
	private int rating;	
	
	
	protected Recipe() {		
	}
	
	public Recipe(String name, RecipeType recipeType) {
		super();
		this.name = name;
		this.recipeType = recipeType;
	}
	
	public String getName() {
		return this.name;
	}
	
	public RecipeType getType() {
		return this.recipeType;
	}
	
	public void setType(RecipeType recipeType) {
		this.recipeType = recipeType;
	}
	
	public String getRecipeMethod() {
		return this.recipeMethod;
	}
	
	public void setRecipeMethod(String recipeMethod) {
		this.recipeMethod = recipeMethod;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return String.format("Name = %s, RecipeType = %s, RecipeMethod = %s, Rating = %d",
				this.name,
				this.recipeType.toString(),
				this.recipeMethod,
				this.rating); 
	}
}

