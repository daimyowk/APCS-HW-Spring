public class LList{
    private int length=0;
    private Node l=new Node("");

    public void add(String s){
	Node tmp=new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	length++;
    }
		
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public String get(int n){
	Node tmp=l;
	if (n>length){
	    return "list too small";
	}
	for(int x=0;x<n+1;x++){
	    tmp=tmp.getNext(); 
	}
	return tmp.getData();
    }
    
    public void add(int n, String s){
	Node tmp=l;
	for (int x=0;x<n;x++){
	    tmp=tmp.getNext();
	}
	Node stuff= new Node(s);
	stuff.setNext(tmp.getNext());
	tmp.setNext(stuff);
	length++;
    }
    public void remove(int n){
	Node tmp=l;
	for(int x=0;x<n;x++){
	    tmp=tmp.getNext();
	}
	Node stuff=new Node(tmp.getNext().getNext().getData());
	stuff.setNext(tmp.getNext().getNext().getNext());
	tmp.setNext(stuff);
	length--;
		
    }
}
