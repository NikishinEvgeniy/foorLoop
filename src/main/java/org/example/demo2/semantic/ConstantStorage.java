package org.example.demo2.semantic;

import tool.CustomSet;

import java.util.LinkedList;

public class ConstantStorage {
    private static LinkedList<String> linkedList = new LinkedList<>();


    public static void addConstant(StringBuilder stringBuilder){
        boolean flag = false;
        String value = stringBuilder.substring(stringBuilder.length()-(counterConstant.getNumberOfCharacters())-1, stringBuilder.length()-1);
        for(int i = 0; i<value.length()&&!flag;i++){
            if(value.indexOf(CustomSet.getSetForSemanticConstant()[i]) != -1) flag = true;
        }
        if(!flag) linkedList.addLast(value);
    }

    public static LinkedList<String> getLinkedList() {
        return linkedList;
    }
}
