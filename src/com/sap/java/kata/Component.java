package com.sap.java.kata;

public class Component {

    public String layer;

    public Component(int length, String type) {

        layer = " ";

        for (int i = 1; i < length; i++)
            layer += type;

    }

    public Component(int length, int doors) {

        layer = "";

        String[] secondLayer = buildSecondLayer(length, doors);

        for (int i = 0; i < secondLayer.length; i++)
            layer += secondLayer[i];


    }

    public Component(int length) {

        layer = "";

        int wheels = 2;

        wheels += (length - 10) / 2;

        String[] thirdLayer = buildThirdLayer(length, wheels);

        for (int i = 0; i < length; i++)
            layer += thirdLayer[i];

    }

    private String[] buildThirdLayer(int length, int wheels) {

        String[] thirdLayer = new String[length];

        for (int i = 0; i < length / 2; i++) {

            thirdLayer[i] = "-";
            thirdLayer[length - 2 - i] = "-";

        }

        thirdLayer[length - 1] = "'";

        int i = 1;

        while (wheels > 0) {

            thirdLayer[i] = "o";
            wheels--;
            if (wheels > 0) {
                thirdLayer[length - i - 2] = "o";
                wheels--;
            }

            i += 2;

        }

        return thirdLayer;

    }

    private String[] buildSecondLayer(int length, int doors) {
        String[] secLayer = new String[length];

        secLayer[0] = "|";
        secLayer[length - 1] = "\\";

        for (int i = 1; i<length-1; i++)
            secLayer[i] = " ";

        int i = 1;

        while (doors > 0) {

            secLayer[length - 1 - i] = "]";
            secLayer[length - 2 - i] = "[";
            doors--;

            if (doors > 0) {

                secLayer[i] = "[";
                secLayer[i + 1] = "]";
                doors--;

            }

            i += 2;


        }

        return secLayer;

    }

}
