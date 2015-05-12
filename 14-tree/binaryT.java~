import java.io.*;
import java.util.*;
public class binaryT{
    private node root;
    ArrayList<node> lineup = new ArrayList<node>();
    private double limit=0.0;
    private double power=0.0;
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
	   
	    return " ";
			
	    }
	    
	    
	
	else{
	    
	   return traverse(t.getLeft())+t.getData()+", "+traverse(t.getRight());
		
	
	
	}
    }
    public void remove(int i){
	node t = root;
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
	if (t.getRight()==null && before.getData()>i){
	    before.setLeft(t.getLeft());
	}
	else if(t.getRight()==null){
	    before.setRight(t.getLeft());
	}
    }
    public String toString(){
	

	return traverse(root);
	
	}
	
}
