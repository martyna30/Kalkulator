package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class CapricciosaPizzaOrder extends AbstractPizzaDecorator {
    public CapricciosaPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
        addIngredient("ham");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "ham, olives and mushrooms";
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }

    @Override
    public boolean addIngredient(String ingredient) {
         return this.getIngredients().add(ingredient);
    }
}
