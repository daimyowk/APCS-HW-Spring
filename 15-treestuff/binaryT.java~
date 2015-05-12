import java.io.*;
import java.util.*;
public class binaryT{
    node r;
    int maxValue=0;
    public node search(node t, int i){
	if (t==null || t.getData()==i)
	    return t;
	else if (t.getData() < i)
	    return search(t.getRight(),i);
	else
	    return search(t.getLeft(),i);	
    }

    public String search(int i){
	node retval = search(r,i);
	if (retval==null)
	    return "Not Found";
	else
	    return ""+retval;
    }

    public void insert(int i){
	node n = new node(i);
	node t2=null;
	node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }
    public void insert2(int i){
	node n=new node(i);
	node t=r;
	Random r=new Random();
	if (r==null){
	    r=n;
	    return;
	}
    }
    public String traverse(node t){
	if (t==null){	   
	    return " ";			
	}	    	   	
	else{	    
	    return traverse(t.getLeft())+t.getData()+", "+traverse(t.getRight());
	}
    }
    public String toString(){
	return traverse(r);
    }
    public int maxValue(node t){
	if (t==null){
	    
	}
	else if (t.getData()>maxValue){
	    maxValue=t.getData();
	    maxValue(t.getLeft());
	    maxValue(t.getRight());
	}
	else{
	    maxValue(t.getLeft());
	    maxValue(t.getRight());
	}
	return maxValue;		       	    
    }
    public height(node t){
	
    }
    public static void main(String[] args){
	binaryT t = new binaryT();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	System.out.println(t);
	//				t.insert(30);
	System.out.println(t.search(30));
	System.out.println(t.maxValue(t.r));
    }
}
