package org.example.demo2.semantic;

public class counterID {
    private static int numberOfCharacters = 1;

    public static int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public static void setNumberOfCharacters(int numberOfCharacters) {
        counterID.numberOfCharacters = numberOfCharacters;
    }
}
