package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lastLoop = post.length;
        for (int i = 0; i < lastLoop; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}