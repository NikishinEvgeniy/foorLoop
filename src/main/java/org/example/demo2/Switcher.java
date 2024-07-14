package org.example.demo2;

import tool.Node;

public class Switcher {
    public static Node switcherNextNode(Node node, int index){
        return node.getLinks()[index].getNextNode();
    }
}
