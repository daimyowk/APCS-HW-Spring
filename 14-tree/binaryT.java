import java.io.*;
import java.util.*;
public class binaryT{
    private node root;
    public binaryT(node root){
	this.root = root;
    }
    public node search(node t, int i){
	node t1=t;
	node t2=t;
	return t;
    }
    public void insert(node t,int i){
	node n = new node (i);
	while (t!=null){
	    Integer holder=new Integer(t.getData());
	    Integer holder2=new Integer(i);
	    int c = holder.compareTo(holder2);
	    if (c>0){
		t=t.getLeft();
	    }
	    else 
		t=t.getRight();
	}
	    t=n;
	    return;
    }
    public String toString(){
	String s;
        ArrayList<node> prevlevel = new ArrayList<node>;
	s=s+root.getData()+"\n";
	while(!level.empty()){
	    ArrayList<node> level = new ArrayList<node>;
	    s=s+holder.getLeft().getData()+"\n";
	    s=s+holder.getRight().getData()+"\n";
	}
    }
}

