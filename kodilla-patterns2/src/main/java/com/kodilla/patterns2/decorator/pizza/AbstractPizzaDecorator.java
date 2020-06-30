package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaDecorator implements PizzaOrder {
    PizzaOrder pizzaOrder;

    public AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public boolean addIngredient(String ingredient) {
        return pizzaOrder.addIngredient(ingredient);
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();

    }

    @Override
    public List<String> getIngredients() {
        return pizzaOrder.getIngredients();
    }


}
