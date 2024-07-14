package tool;

public class CustomSet {
    private final static char[] SET_OF_NUMBER_WITHOUT_ZERO = new char[]{'1','2','3','4','5','6','7','8','9'};
    private final static char[] SET_OF_NUMBER = new char[]{'0','1','2','3','4','5','6','7','8','9'};
    private final static char[] SET_OF_CHARACTERS = new char[] {'_','A','B','C','D','E','F','G','I','H','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final static char[] SET_FOR_SEMANTIC_CONSTANT = new char[] {'_','A','B','C','D','F','G','I','H','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final static char[] SET_OF_CHARACTERS_WITHOUT_UNDERSCORE = new char[] {'A','B','C','D','E','F','G','I','H','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
    private final static char[] SET_OF_COMPARISON_SIGNS = new char[] {'<','>'};
    private final static char[] SET_OF_SIGNS = new char[] {'+','-','*','/','%'};
    private final static String[] SET_OF_REVERSED_WORDS = new String[] {"FOR","WHILE","BREAK","SWITCH","CASE","CONST"};
    private final static int MAX_VALUE = 32767;
    private final static int MIN_VALUE = -32768;

    public static int getMaxValue(){return MAX_VALUE;}
    public static int getMinValue(){return MIN_VALUE;}
    public static String[] getSetOfReversedWords(){ return  SET_OF_REVERSED_WORDS;}
    public static char[] getSetForSemanticConstant(){ return SET_FOR_SEMANTIC_CONSTANT;}
    public static char[] getSetOfCharacters() {
        return SET_OF_CHARACTERS;
    }
    public static char[] getSetOfNumber() {
        return SET_OF_NUMBER;
    }
    public static char[] getSetOfCharactersWithoutUnderscore() {
        return SET_OF_CHARACTERS_WITHOUT_UNDERSCORE;
    }
    public static char[] getSetOfNumberWithoutZero() {
        return SET_OF_NUMBER_WITHOUT_ZERO;
    }
    public static char[] getSetOfComparisonSigns(){ return SET_OF_COMPARISON_SIGNS;}
    public static char[] getSetOfSigns() { return SET_OF_SIGNS;}
}
