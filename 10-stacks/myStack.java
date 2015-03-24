public class myStack<E> {
    private Node<E> top;
    private Node<E> dummy;
    public myStack() {
	top = null;
	dummy = new Node<E>();
	dummy.setNext(top);
	top.setPrev(dummy);
    }
    public myStack( Node<E> b ) {
	top = b;
	dummy = new Node<E>();
	dummy.setNext(top);
	top.setPrev(dummy);
    }
    public void push( E data ) {
	if ( top == null ) {
	    top = new Node<E>(dummy, null, data);
	} else {
	    Node<E> n = new Node<E>(top, null, data);
	    top.setNext(n);
	    n.setPrev(top);
	    top = n;
	}
    }
    public E pop() {
	if (top==null){
	    return top.getData();
	}
	Node<E> tmp = top;
	top.getPrev().setNext(null);
	top = top.getPrev();
	return tmp.getData();
    }
    public boolean empty() {
	if (top==dummy){
	    return true;
	}
	else {
	    return false;
	}
    }
    public E top() {
	return top.getData();
    }
    public String toString() {
	String s = "";
	Node<E> tmp = top;
	while( tmp.getData() != null ) {
	    s = s + tmp.getData() + " , ";
	    tmp = tmp.getPrev();
	}
	return s;
    }
}
