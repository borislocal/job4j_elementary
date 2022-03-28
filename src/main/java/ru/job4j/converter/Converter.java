package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return -1;
    }

    public static void main(String[] args) {
        float euroIn = 140;
        float euroExpected = 2;
        float euroOut = Converter.rubleToEuro(euroIn);
        boolean euroPassed = euroExpected == euroOut;
        System.out.println("140 rubles are 2 euro. Test result : " + euroPassed);

        float dollarIn = 300;
        float dollarExpected = 5;
        float dollarOut = Converter.rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;
        System.out.println("300 rubles are 5 dollars. Test result : " + dollarPassed);
    }
}