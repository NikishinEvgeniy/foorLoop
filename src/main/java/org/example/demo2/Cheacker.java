package org.example.demo2;

import org.example.demo2.semantic.ConstantStorage;
import org.example.demo2.semantic.StorageID;
import org.example.demo2.semantic.counterConstant;
import org.example.demo2.semantic.counterID;
import tool.CustomSet;
import tool.Link;
import tool.Node;


public class Cheacker {
    private static int linkIndex = -1;
    private static boolean nextForLoopIdNode = false;

    public static boolean isNodeValue(Node node, char value) {
        char[] arr = node.getValues();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                flag = true;
            }
        }
        return flag;
    }
    public static boolean isLinkValue(Node node, char value) {
        Link[] links = node.getLinks();
        boolean flag = false;
        for (int i = 0; i < links.length && !flag; i++) {
            for (int j = 0; j < links[i].getValues().length && !flag; j++) {
                if (links[i].getValues()[j] == value) {
                    linkIndex = i;
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean canWriteIDSymbol(Node node){
        boolean canWrite = true;
        int numberCharacters = counterID.getNumberOfCharacters();
        if(node.getValues() == CustomSet.getSetOfCharactersWithoutUnderscore()){
            if(numberCharacters < 13) {
                counterID.setNumberOfCharacters(counterID.getNumberOfCharacters() + 1);
            }
            else canWrite = false;
        }
        else {
            counterID.setNumberOfCharacters(1);
        }
        return canWrite;
    }
    public static boolean isReversedWord(Node prefNode, StringBuilder stringBuilder){
        boolean flag = false;
        if(prefNode.getValues() == CustomSet.getSetOfCharactersWithoutUnderscore()){
            int length = stringBuilder.length();
            String[] reversedWords = CustomSet.getSetOfReversedWords();
            String userWord = stringBuilder.substring(length - counterID.getNumberOfCharacters(),length - 1);
            for(int i = 0 ; i < reversedWords.length && !flag; i ++){
                if(reversedWords[i].equals(userWord)) flag = true;
            }
        }
        return flag;
    }

    public static boolean canAddId(Node prefNode){
        boolean canAdd = false;
        if(prefNode.getValues() == CustomSet.getSetOfCharactersWithoutUnderscore()){
            canAdd = true;
        }
        return canAdd;
    }
    public static void nextNodeIsForLoopID(char value){
        if(value == ';') nextForLoopIdNode = true;
    }
    public static boolean forLoopIsRight(Node prefNode, StringBuilder stringBuilder){
        boolean isRightForLoop = true;
        boolean checkNodeBeforeSymbol = true;
        if(prefNode != null){
            for(int i = 0 ; i < prefNode.getLinks().length; i++){
                for(int j = 0; j < prefNode.getLinks()[i].getValues().length; j ++){
                    if(prefNode.getLinks()[i].getValues()[j] == ';') checkNodeBeforeSymbol = false;
                }
            }
        }
        if(prefNode.getValues() == CustomSet.getSetOfCharactersWithoutUnderscore() && nextForLoopIdNode && checkNodeBeforeSymbol){
            int length = stringBuilder.length();
            String userWord = stringBuilder.substring(length - counterID.getNumberOfCharacters(),length - 1);
            if(!userWord.equals(StorageID.getStorageId().get(0))) isRightForLoop = false;
            nextForLoopIdNode = false;
        }
        return isRightForLoop;
    }

    public static void isConstNode(Node prefNode, char value){
            boolean isConstant = false;
            boolean canNextCheck = false;
            int helpCounter = 0;
            for(int i = 0 ; i < prefNode.getLinks().length; i ++ ){
                if(prefNode.getLinks()[i].getValues() == CustomSet.getSetOfNumberWithoutZero()){ canNextCheck = true; }
                else {
                    for(int j = 0;j < prefNode.getLinks()[i].getValues().length;j++){
                        if(prefNode.getLinks()[i].getValues()[j] == '0'){
                            helpCounter++;
                        }
                        else if(prefNode.getLinks()[i].getValues()[j] == '-') helpCounter++;
                    }
                }
            }
            if(canNextCheck && helpCounter > 0){
                if(value == '-'){ isConstant = true; }
                else if(value == '0'){ isConstant = true; }
                else if((value - '0')<10 && (value - '0')>0) isConstant = true;
            }
            counterConstant.setCounterHasGone(isConstant);
    }
    public static boolean canCount(char value,StringBuilder stringBuilder){
            boolean flag = false;
            for(int i = 0 ; i < CustomSet.getSetOfNumber().length && !flag;i++){
                if(value == CustomSet.getSetOfNumber()[i]) flag = true;
            }
            if(flag != true){
                if(value == '.') flag = true;
                else if(value == 'E') flag = true;
                else if((value == '+') || (value == '-')){
                    if(stringBuilder.charAt(stringBuilder.length()-2) == 'E') flag = true;
                    else if(stringBuilder.charAt(stringBuilder.length()-2) == ' ') flag = true;
                    else if(stringBuilder.charAt(stringBuilder.length()-2) == '=') flag = true;
                    else if(stringBuilder.charAt(stringBuilder.length()-2) == '[') flag = true;
                    else flag = false;
                }
                else flag = false;
            }
            return flag;
    }
    public static boolean integerHasGoneOutOfBounds(){
        boolean notHasGoneOutOfBounds = false;
        for(int i=0; i < ConstantStorage.getLinkedList().size() && !notHasGoneOutOfBounds;i++){
            if(ConstantStorage.getLinkedList().get(i).indexOf('E') == -1 && ConstantStorage.getLinkedList().get(i).indexOf('.') == -1){
                double value =Double.valueOf(ConstantStorage.getLinkedList().get(i));
                if( value < CustomSet.getMinValue() || value > CustomSet.getMaxValue()) notHasGoneOutOfBounds = true;
            }
        }
        return notHasGoneOutOfBounds;
    }


    public static int getLinkIndex() {
        return linkIndex;
    }
}
