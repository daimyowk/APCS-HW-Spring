public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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
    public String find(int n){
	int counter=0;
	for (Node x=l;x!=null;x=x.getNext()){
	    if (counter==n){
		return x.getData();
	    }
	    counter++;
	}
	return "";
    }
    
    public void insert(int n, String s){
	Node holder=l;
	if (n==0){
	    this.add(s);
	    return;
	}
	for (int x=0;x<n-1;x++){
	    holder=holder.getNext();
	}
	Node stuff= new Node(s);
	stuff.setNext(holder.getNext());
	holder.setNext(stuff);
    }
}
