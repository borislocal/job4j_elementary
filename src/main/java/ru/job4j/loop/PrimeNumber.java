package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count = count + 1;
            }
        }
        return count;
    }
}
//5.6. Простые числа [#156314]