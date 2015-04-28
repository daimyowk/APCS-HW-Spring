public class SNode<E> {
    private E data;
    private SNode<E> next;
    private SNode<E> prev;
    public SNode() {
	data = null;
	next = null;
	prev = null;
    }
    public SNode( E s ) {
	data = s;
	next = null;
	prev = null;
    }
    public SNode( SNode<E> p, SNode<E> n, E s ) {
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
    public void setNext( SNode<E> n ) {
	next = n;
    }
    public void setPrev( SNode<E> n ) {
	prev = n;
    }
    public SNode<E> getPrev(){
	return prev;
    }
    public SNode<E> getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }
}
