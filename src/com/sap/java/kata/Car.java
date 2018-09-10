package com.sap.java.kata;

public class Car {

    public Body body;
    public Chassis chassis;

    public Car(int length, int doors) throws IndexOutOfBoundsException {

        verifyLength(length);
        verifyDoors(length, doors);

        body = new Body(length, doors);
        chassis = new Chassis(length);


    }

    private void verifyLength(int length) throws IndexOutOfBoundsException {

        if (length < 7)
            throw new IndexOutOfBoundsException();

    }

    private void verifyDoors(int length, int doors) throws IndexOutOfBoundsException {

        if (doors < 1)
            throw new IndexOutOfBoundsException();

        if ((length - 3 - doors * 2) < 0)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {


        return body.toString() + chassis.toString();

    }

}
