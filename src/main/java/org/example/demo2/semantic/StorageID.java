package org.example.demo2.semantic;


import java.util.LinkedList;

public class StorageID {
    private static LinkedList<String> storageId = new LinkedList<>();
    public static void addID(StringBuilder stringBuilder){
        int length = stringBuilder.length();
        String userId = stringBuilder.substring(length - counterID.getNumberOfCharacters(),length - 1);
        if(!storageId.contains(userId)) storageId.add(userId);
    }
    public static LinkedList<String> getStorageId(){
        return storageId;
    }
}
