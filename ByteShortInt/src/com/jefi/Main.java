package com.jefi;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myNewByteValue = (byte) (minByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short minShortValue = -32_768;
        short maxShortValue = 32_767;
        short myNewShortValue = (short) (maxShortValue / 2);

        // long has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;
    }
}
