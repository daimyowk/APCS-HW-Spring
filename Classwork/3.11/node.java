public class node{
    private String data;
    private node next;
    public Node(String s){
	data=s;
    }
    public void setData(String s){
	data=s
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
