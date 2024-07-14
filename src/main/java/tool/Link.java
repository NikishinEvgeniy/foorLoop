package tool;

public class Link {

    private Node nextNode;
    private Node prefNode;
    private char [] values;

    public Node getPrefNode() {
        return prefNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
    public char[] getValues() {
        return this.values;
    }

    public Link(char value, Node prefNode, Node nextNode){
        this.values = new char[]{value};
        this.prefNode = prefNode;
        this.nextNode = nextNode;
    }
    public Link(char[] values, Node prefNode, Node nextNode){
        this.values = values;
        this.prefNode = prefNode;
        this.nextNode = nextNode;
    }
}
