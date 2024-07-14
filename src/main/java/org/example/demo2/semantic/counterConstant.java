package org.example.demo2.semantic;

public class counterConstant {
    private static int numberOfCharacters = 0;
    private static boolean counterHasGone = false;

    public static boolean isCounterHasGone() {
        return counterHasGone;
    }

    public static void setCounterHasGone(boolean counterHasGone) {
        counterConstant.counterHasGone = counterHasGone;
    }

    public static int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public static void setNumberOfCharacters(int numberOfCharacters) {
        counterConstant.numberOfCharacters = numberOfCharacters;
    }
}
