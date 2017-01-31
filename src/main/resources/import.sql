-- Ingredients
insert into ingredient(name, ingredient_type, brand, rating) values ('Rose Oil', 0, 'Tesco', 7) --1
insert into ingredient(name, ingredient_type, brand, rating) values ('Baking Soda', 3, 'Tesco', 3) --2
insert into ingredient(name, ingredient_type, brand, rating) values ('Holy Water', 5, 'Asda', 10) --3
insert into ingredient(name, ingredient_type, brand, rating) values ('White emulsifier', 6, 'Amazon', 10) --4
insert into ingredient(name, ingredient_type, brand, rating) values ('Oats', 4, 'Boots', 1) --5
insert into ingredient(name, ingredient_type, brand, rating) values ('Lavender', 4, 'Harrods', 6) --6
insert into ingredient(name, ingredient_type, brand, rating) values ('Lavender Oil', 1, 'Amazon', 5) --7
insert into ingredient(name, ingredient_type, brand, rating) values ('Shea Butter', 2, 'Borough Market', 10) --8

-- Recipe 1
insert into recipe(name, recipe_type, recipe_method, rating) values ('rose-soap', 0, 'Step 1. Do something, Step 2. Finish', 8)

-- Recipe 2
insert into recipe(name, recipe_type, recipe_method, rating) values ('lavender-bliss', 5, 'Step 1. Do something, Step 2. Panic, Step 3. Give up', 5)

-- Recipe 3
insert into recipe(name, recipe_type, recipe_method, rating) values ('scrubbadubdub', 3, 'Step 1..... Hello? Sorry can not be bothered to start', 2)

-- Join Table
-- Recipe 1
insert into recipe_ingredients(recipe_id, ingredient_id) values (1,1)
insert into recipe_ingredients(recipe_id, ingredient_id) values (1,4)
insert into recipe_ingredients(recipe_id, ingredient_id) values (1,7)
insert into recipe_ingredients(recipe_id, ingredient_id) values (1,8)

-- Recipe 2
insert into recipe_ingredients(recipe_id, ingredient_id) values (2,7)
insert into recipe_ingredients(recipe_id, ingredient_id) values (2,8)

-- Recipe 3
insert into recipe_ingredients(recipe_id, ingredient_id) values (3,1)
insert into recipe_ingredients(recipe_id, ingredient_id) values (3,2)
insert into recipe_ingredients(recipe_id, ingredient_id) values (3,6)
insert into recipe_ingredients(recipe_id, ingredient_id) values (3,7)



