import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private boolean nextused=false;
    private Node<E> prev;
    public LLit(Node<E> n){
	t=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	prev=t;
	//	t.setPrev(t);
	t=t.getNext();
	nextused=true;
	return retval;
    }
    
    public void remove(){
	if (nextused && this.hasNext()){
	    if (t.getNext()==null){
		t.setNext(null);
	    }
	    else{
		//System.out.println(t);
		//System.out.println(t.getPrev());
		t.getPrev().setData(null);
	    }
	    nextused=false;
	}
	// to be completed for homework
    }
}

