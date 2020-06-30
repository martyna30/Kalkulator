package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PepperoniPizzaOrder extends AbstractPizzaDecorator {
    public PepperoniPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
        addIngredient("pepperoni");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and pepperoni";
    }

    @Override
    public boolean addIngredient(String ingredient) {
        return super.addIngredient(ingredient);
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }
}
