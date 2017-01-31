package priya.system.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.NaturalId;

@Entity
public class Ingredient implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NaturalId
	private String name;
	
	@Column(name = "INGREDIENT_TYPE", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private IngredientType ingredientType;
	
	@Column(nullable = false)
	private String brand;
	
	@Column
	private int rating;	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RecipeIngredients",
		joinColumns = { @JoinColumn(name = "ingredient_id") },
		inverseJoinColumns = { @JoinColumn(name = "recipe_id") })
	private Set<Recipe> recipes;	
	
	protected Ingredient() {		
	}
	
	public Ingredient(String name, IngredientType ingredientType, String brand) {
		this.name = name;
		this.ingredientType = ingredientType;
		this.brand = brand;
	}
	
	public String getName() {
		return this.name;
	}
	
	public IngredientType getIngredientType() {
		return this.ingredientType;
	}
	
	public String getBrand() {
		return this.brand;
	}	
	
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
}

