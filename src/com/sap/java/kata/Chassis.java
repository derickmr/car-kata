package com.sap.java.kata;

public class Chassis {

    public Component component;

    public Chassis(int length) {

        component = new Component(length);

    }

    @Override

    public String toString() {

        return component.layer;

    }

}
