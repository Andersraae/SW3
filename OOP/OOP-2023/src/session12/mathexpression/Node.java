package session12.mathexpression;

public abstract class Node{
    protected String string;

    public Node(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}