import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	int holder=0;
	for (Node x: l){
	    if (x.getPriority()<n.getPriority()){
		holder++;
	    }
	}
	l.add(holder,n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










