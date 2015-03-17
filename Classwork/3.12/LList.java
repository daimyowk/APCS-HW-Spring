public class LList{
    private node l=null;
    public void add(String s){
       node tmp =new node(s);
       tmp.setNext(l);
       l=tmp;
    }
    public String toString(){
	String s="";
	node tmp;
	for (tmp=l;tmp!=null;tmp=tmp.getNext()){
	    s=s+tmp+" --> ";
	}
	s=s+"null";
	return s;
    }
}
