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
	while (t1!=null){
	    Integer test  = new Integer(t1.getData());
	    Integer find = new Integer(i);
	    int c= test.compareTo(find);
	    if (c==0){
		return t1;
	    }
	    else if (c>0){
		t1=t1.getLeft();
	    }
	    else
		t1=t1.getRight();
	}
	return null;
	}
	    
		    


    public void insert(node t,int i){
        
	node n = new node (i);
	node before=null;
	while (t!=null){
	    Integer holder=new Integer(t.getData());
	    Integer holder2=new Integer(i);
	    int c = holder.compareTo(holder2);
	    if (c>0){
		before=t;
		t=t.getLeft();
	        
	    }
	    else {
		before=t;
		t=t.getRight();
	        
	    }
	}
        if (before.getData()>i){
	    before.setLeft(n);
	}
	else
	    before.setRight(n);
    }
	/*	if (thing.getLeft()==null && thing.getData()>i){
	    thing.setLeft(n);
	}
	else
	    thing.setRight(n);
	    return;*/

    
    public String toString(){
	String s;
        /*ArrayList<node> prevlevel = new ArrayList<node>();
	s=s+root.getData()+"\n";
	holder=root;
	while(!level.empty()){
	    ArrayList<node> level = new ArrayList<node>();
	    s=s+holder.getLeft().getData()+"  ";
	    s=s+holder.getRight().getData()+"  ";
	node holder=root;
	ArrayList<node> level = new ArrayList<node>();
	while(!(holder.getRight()=null && holder.getLeft()=null)){
	    s=s+"left:"+holder.getLeft()+"  ";
	    s=s+"right:"+holder.getRight()+"   ";
	    level.add(holder.getLeft());
	    level.add(holder.getRight());
	    holder=level.get(0);
	    level.remove(0);*/
	System.out.println(root.getData());
	System.out.println(root.getLeft().getData());
	System.out.println(root.getRight().getData());
	System.out.println();
	System.out.println("  "+root.getLeft().getData());
	System.out.println(root.getLeft().getLeft().getData()+" "+root.getLeft().getRight().getData());

	System.out.println();
	System.out.println("  "+root.getRight().getData());
	System.out.println(root.getRight().getLeft().getData()+" "+root.getRight().getRight().getData());
	return "done";
					   
	}
	
}
