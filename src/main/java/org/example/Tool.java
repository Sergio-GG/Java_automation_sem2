package org.example;

public class Tool implements PackageInterface{
    private final int price;

    public Tool(int price) {
        this.price = price;
    }

    @Override
    public int cost() {
        return price;
    }
}
