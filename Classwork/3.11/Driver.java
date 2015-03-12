public class Driver{
    public static void main(String[] args){
	node n= new node("hello");
	//	System.out.println(n.getData());
        

	node n2= new node("world");
	//	System.out.println(n2.getData());

	n.setNext(n2);
	//	System.out.println(n.getNext().getData());
	//	System.out.println(n.getNext());

	n2.setData("pickle");
	//	System.out.println(n.getNext());

	n.getNext().setData("Watermelon");
	//	System.out.println(n2);

	n.getNext().setNext(new node("abc"));
	//	System.out.println(n2.getNext());

	n.getNext().getNext().setNext(new node("aaa"));
	//	System.out.println(n2.getNext().getNext());

	node tmp=new node("first");
	tmp.setNext(n);
	n=tmp;
	//	System.out.println(n);
	//	System.out.println(n.getNext());

	tmp=new node("new first");
	tmp.setNext(n);
	n=tmp;
	//	System.out.println(n);
	//System.out.println(n.getNext());
	
	
	 tmp=n;
	while (tmp!=null) { //exit test
	    System.out.print(tmp+", ");
	    tmp=tmp.getNext();
	}
	System.out.println();

	for(tmp=n;tmp!=null;tmp=tmp.getNext()){
	    System.out.println(tmp+", ");
	}
	System.out.println();

	
    }
}
