package com.company;

public class Main {

    public static void main(String[] args) {
        int numCount = 0;
        float sum = 0.0F;
        boolean firstNegative = false;
        float[] array = new float[16];
        array[0] = 10.5F;
        array[1] = 20.3F;
        array[2] = 30.8F;
        array[3] = 40.2F;
        array[4] = 50.5F;
        array[5] = 60.6F;
        array[6] = 70.5F;
        array[7] = -10.F;
        array[8] = 20.5F;
        array[9] = 30.9F;
        array[10] = 40.5F;
        array[11] = 50.8F;
        array[12] = 60.8F;
        array[13] = -70.5F;
        array[14] = -80.3F;
        array[15] = -90.9F;

        for (float item : array) {
            if (item < 0){
                firstNegative = true;
            }else{
                if (firstNegative){
                    sum += item;
                    numCount++;
                    System.out.println("sum: " + sum + " count: " + numCount);
                }
            }
        }
        System.out.println("result: " + sum/numCount);

    }


}
