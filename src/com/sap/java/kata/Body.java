package com.sap.java.kata;

public class Body extends Component {

    public Body(int length, int doors) {

        buildFirstLayer(length - 2);
        buildSecondLayer(length - 1, doors);


    }


    private void buildFirstLayer(int length) {

        component = " ";

        for (int i = 1; i < length; i++)
            component += "_";

        component += "\n";

    }

    private void buildSecondLayer(int length, int doors) {

        String[] midOfSecondLayer = fillSecondLayer(length - 2, doors);


        component += "|";

        for (int i = 0; i < midOfSecondLayer.length; i++)
            component += midOfSecondLayer[i];

        component += "\\\n";


    }

    private String[] fillSecondLayer(int length, int doors) {

        String[] tempLayer = new String[length];
        int i = 0;

        for (i = 0; i < length - 1; i++) {

            tempLayer[i] = " ";

        }

        tempLayer = putDoors(tempLayer, doors);

        return tempLayer;

    }

    private String[] putDoors(String[] tempLayer, int doors) {

        int i = 0;
        int length = tempLayer.length;

        while (doors > 0) {

            tempLayer[length - 1 - i] = "]";
            tempLayer[length - 2 - i] = "[";
            doors--;

            if (doors > 0) {

                tempLayer[i] = "[";
                tempLayer[i + 1] = "]";
                doors--;

            }

            i += 2;

        }

        return tempLayer;

    }


    @Override
    public String toString() {

        return component;

    }
}
