public class Driver {
    public static void main( String[] args ) {
	Node<Integer> n = new Node<Integer>(3);
	myStack<Integer> s = new myStack<Integer>(n);
	System.out.println(s);
	s.push(4);
	s.push(5);
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.empty());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.empty());
	s.push(6);
	System.out.println(s);
    }
}
