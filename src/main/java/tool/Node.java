package tool;


public class Node {

    private char [] values;
    private Link[] links;

    public Node(char value, int size){
        this.values = new char[]{value};
        this.links = new Link[size];
    }
    public Node(char [] values, int size){
        this.values = values;
        this.links = new Link[size];
    }

    public char[] getValues() {
        return this.values;
    }
    public Link[] getLinks(){ return this.links; }

}
