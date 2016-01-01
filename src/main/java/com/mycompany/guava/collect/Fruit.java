package com.mycompany.guava.collect;

/**
 * @author mohanarao_sv
 *
 */
public class Fruit {

    private String fruitName;
    private String fruitColor;

    public Fruit(final String fruitName, final String fruitColor) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }

    public void setFruitName(final String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitColor(final String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public String getFruitName() {
        return fruitName;
    }
}
