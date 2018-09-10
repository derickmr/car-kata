package com.sap.java.kata;

public class Chassis extends Component {


    public Chassis(int length) {

        int axls = calculateNumberOfAxls(length);

        buildThirdLayer(length, axls);

    }


    private void buildThirdLayer(int length, int axls) {

        String[] tempLayer = fillThirdLayer(length, axls);


        component = "";

        for (int i = 0; i < tempLayer.length; i++) {

            component += tempLayer[i];

        }


    }

    private int calculateNumberOfAxls(int length) {

        int axls = 2;
        if (length > 10)
            axls += (length - 10) / 2;

        return axls;

    }

    private String[] fillThirdLayer(int length, int axls) {

        String[] tempLayer = new String[length];

        for (int i = 0; i < tempLayer.length; i++) {

            tempLayer[i] = "-";


        }

        tempLayer[tempLayer.length - 1] = "'";

        tempLayer = putAxls(tempLayer, axls);

        return tempLayer;

    }

    private String[] putAxls(String[] tempLayer, int axls) {

        int i = 1;
        int length = tempLayer.length;


        while (axls > 0) {

            tempLayer[i] = "o";
            axls--;

            if (axls > 0) {

                tempLayer[length - 2 - i] = "o";
                axls--;

            }


        }

        return tempLayer;

    }


    @Override

    public String toString() {

        return component;

    }

}
