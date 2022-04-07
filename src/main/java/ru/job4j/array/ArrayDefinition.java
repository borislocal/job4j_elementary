package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Ярослав";
        names[1] = "Матвей";
        names[2] = "Олег";
        names[3] = "Никита";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
