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
    public String search(int i){
	node retval = search(root,i);
	if (retval==null)
	    return "Not Found";
	else
	    return ""+retval;
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

    public String traverse(node t){
	if (t==null){
	    return "";
	}
	else{
	    return t+"\n"+traverse(t.getLeft())+traverse(t.getRight());
	}
    }
    public String toString(){
	return traverse(root);
	/*	System.out.println(root.getData());
	System.out.println(root.getLeft().getData());
	System.out.println(root.getRight().getData());
	System.out.println();
	System.out.println("  "+root.getLeft().getData());
	System.out.println(root.getLeft().getLeft().getData()+" "+root.getLeft().getRight().getData());

	System.out.println();
	System.out.println("  "+root.getRight().getData());
	System.out.println(root.getRight().getLeft().getData()+" "+root.getRight().getRight().getData());
	return "done";
	*/		   
	}
	
}
