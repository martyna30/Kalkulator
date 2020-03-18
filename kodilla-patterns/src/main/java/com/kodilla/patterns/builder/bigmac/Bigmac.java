package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;//ilośc kotletow
    private final String sauce;
    private final List<String> ingredients;// = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);

        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);//dlaczego tu array
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSouce() {
        return sauce;
    }

    public List<String> getIgredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac(" +
                "bun:" + bun  +
                ", amount of burgers: " + burgers +
                ", sauce: " + sauce  +
                ", ingredients: " + ingredients + ")";
    }
}







