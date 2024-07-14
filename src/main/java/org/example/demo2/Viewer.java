package org.example.demo2;

import javafx.scene.control.Label;
import tool.Link;
import tool.Node;


public class Viewer {
    public static void viewUserInputs(StringBuilder sb, Label userText){
        userText.setText(sb.toString());
    }
    public static String viewLinkValue(Node node){
        Link[] links = node.getLinks();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < links.length; i ++){
            sb.append("Связь: " + i + "\n");
            for(int j = 0; j < links[i].getValues().length;j++){
                sb.append(links[i].getValues()[j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static String  viewNodeValue(Node node){
        StringBuilder sb = new StringBuilder();
        char[] values = node.getValues();
        sb.append("\n");
        sb.append("Значение узла: \n");
        for(int i = 0;i < values.length; i ++){
            sb.append(values[i] + " ");
        }
        return sb.toString();
    }
    public static void consoleViewUserInputs(StringBuilder stringBuilder){
        System.out.println("----------------------");
        System.out.println(stringBuilder.toString());
        System.out.println("----------------------");
    }
}
