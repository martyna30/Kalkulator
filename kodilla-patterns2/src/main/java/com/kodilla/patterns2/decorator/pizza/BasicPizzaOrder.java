package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {
    private String sauce;
    private String cheese;
    private List<String> ingredients;

    public BasicPizzaOrder(String sauce, String cheese, List<String> ingredients) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.ingredients = ingredients != null ? new ArrayList<>(ingredients) : new ArrayList<>();
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public boolean addIngredient(String ingredient) {
        return ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String getDescription() {
        return ("Pizza with Tomato sauce, cheese and ");
    }




}



