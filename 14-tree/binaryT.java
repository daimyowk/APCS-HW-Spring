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
	    //lineup.remove(0);
	    // System.out.println(lineup);
	    /*
	    for (int x=0;x<lineup.size();x++){
		System.out.println(x);
		if(lineup.get(x)==null){
		    lineup.remove(lineup.get(x));
		}
		traverse(lineup.get(x));
		/*if (!(x==null)){
		    traverse(x);
		}
		else
		return " ";*/
	    return " ";
			
	    }
	    
	    
	
	else{
	    lineup.add(lineup.get(0).getLeft());
	    lineup.add(lineup.get(0).getRight());
	    //System.out.println(lineup);
	    limit++;
	    if (limit==Math.pow(2.0,power)){
		power++;
		return "\n  "+lineup.remove(0)+traverse(lineup.get(0))+"";
		
	    }
	    else
	    return "  "+lineup.remove(0)+traverse(lineup.get(0))+"  ";
	    //return t+"\n"+traverse(t.getLeft())+traverse(t.getRight())+"\n";
	    }
	
	
    }
    public String toString(){
	
	lineup.add(root);
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
