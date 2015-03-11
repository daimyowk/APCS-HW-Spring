public class Driver{
    public static void main(String[] args){
	node n= new node("hello");
	System.out.println(n.getData());
        
	node n2= new Node("world");
	System.out.printlnt(n2.getData());

	n.setNext(n2);
	System.out.println(n.getNext().getData());
	System.out.println(n.getNext());

	n2.setData("pickle");
	System.out.println(n.getNext());

	n.getNext().setData("Watermelon");
	Sysetm.out.println(n2);


	
    }
}
