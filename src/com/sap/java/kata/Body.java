package com.sap.java.kata;

public class Body {

    public Component firstLayer;
    public Component secondLayer;

    public Body(int length, int doors) {

        firstLayer = new Component(length - 2, "_");
        secondLayer = new Component(length - 1, doors);

    }

    public String toString() {

        return firstLayer.layer + "\n" + secondLayer.layer + "\n";

    }

}
