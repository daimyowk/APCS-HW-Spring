public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> prev;
    public Node() {
	data = null;
	next = null;
	prev = null;
    }
    public Node( E s ) {
	data = s;
	next = null;
	prev = null;
    }
    public Node( Node<E> p, Node<E> n, E s ) {
	data = s;
	next = n;
	prev = p;
    }
    public void setData( E s ) {
	data = s;
    }
    public E getData() {
	return data;
    }
    public void setNext( Node<E> n ) {
	next = n;
    }
    public void setPrev( Node<E> n ) {
	prev = n;
    }
    public Node<E> getPrev(){
	return prev;
    }
    public Node<E> getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }
}
