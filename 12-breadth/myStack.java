public class myStack<E> {
    private SNode<E> top;
    private SNode<E> dummy;
    public myStack() {
	top = new SNode<E>();
	dummy = new SNode<E>();
	dummy.setNext(top);
	top.setPrev(dummy);
    }
    public myStack( SNode<E> b ) {
	top = b;
	dummy = new SNode<E>();
	dummy.setNext(top);
	top.setPrev(dummy);
    }
    public void push( E data ) {
	if ( top == null ) {
	    top = new SNode<E>(dummy, null, data);
	} else {
	    SNode<E> n = new SNode<E>(top, null, data);
	    top.setNext(n);
	    n.setPrev(top);
	    top = n;
	}
    }
    public E pop() {
	if (top==null){
	    return top.getData();
	}
	SNode<E> tmp = top;
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
	SNode<E> tmp = top;
	while( tmp.getData() != null ) {
	    s = s + tmp.getData() + " , ";
	    tmp = tmp.getPrev();
	}
	return s;
    }
}
