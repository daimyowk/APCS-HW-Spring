public class node{
    private node right;
    private node left;
    private int data;
    public node(int d){
	data=d;
	right=null;
	left=null;
    }
    public void setRight(node r){
	right=r;
    }
    public void setLeft(node l){
	left=l;
    }
    public node getRight(){
	return right;
    }
    public node getLeft(){
	return left;
    }
    public int getData(){
	return data;
    }
    public void setData(int i){
	data=i;
    }
    public String toString(){
	String s=""+this.getData();
	return s;
    }
}
