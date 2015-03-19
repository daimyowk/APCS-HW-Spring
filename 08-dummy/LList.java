public class LList{
    private int length=0;
    private Node l=new Node(0);

    public void add(int s){
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
    public int get(int n){
	Node tmp=l;
	if (n>length){
	    return 00000;
	}
	for(int x=0;x<n+1;x++){
	    tmp=tmp.getNext(); 
	}
	return tmp.getData();
    }
    
    public void add(int n, int s){
	Node tmp=l;
	for (int x=0;x<n;x++){
	    tmp=tmp.getNext();
	}
	Node stuff= new Node(s);
	stuff.setNext(tmp.getNext());
	tmp.setNext(stuff);
	length++;
    }
    public int remove(int n){
	Node tmp=l;
	for(int x=0;x<n;x++){
	    tmp=tmp.getNext();
	}
	Node stuff=new Node(tmp.getNext().getNext().getData());
	stuff.setNext(tmp.getNext().getNext().getNext());
	int value=tmp.getNext().getData();
	tmp.setNext(stuff);
	length--;
	return value;
		
    }
    public boolean remove2(int i){
	Node tmp=l.getNext();
	for(int x=0;x<length;x++){
	    if (tmp.getData()==i){
		this.remove(x);
		return true;
	    }
	    tmp=tmp.getNext();
	}
	return false;
	    
    }
    public int size(){
	return length;
    }
}
