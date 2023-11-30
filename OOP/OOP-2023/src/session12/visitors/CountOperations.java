package session12.visitors;

import session12.mathexpression.Node;
import session12.mathexpression.SumNode;

public class CountOperations implements Visitor {
    private int numberOfOperations = 0;
    @Override
    public void visit(Node node) {
        if (node instanceof SumNode) {
            this.numberOfOperations++;
        }
    }

    @Override
    public String toString(){
        return "" + numberOfOperations;
    }
}
