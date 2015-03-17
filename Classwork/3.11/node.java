public class node{
    private String data;
    private node next;
    public node(String s){
	data=s;
	next=null;
    }
    public void setData(String s){
	data=s;
    }
    public String getData(){
	return data;
    }
    public void setNext(node n){
	next=n;
    }
    public node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
}
