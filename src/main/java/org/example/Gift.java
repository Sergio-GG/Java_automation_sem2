package org.example;

public class Gift implements PackageInterface{

    private final int price;

    public Gift(int price) {
        this.price = price;
    }

    @Override
    public int cost() {
        return price;
    }
}
