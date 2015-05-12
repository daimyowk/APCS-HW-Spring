import java.io.*;
import java.util.*;
public class binaryT{
    node r;
    int maxValue=0;
    int height=0;
    int testheight=0;
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
	        t=t.getRight();
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else if (i==t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
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
    public void findheight(node t){
	if(t==null){
	    if (testheight>height){
		height=testheight;
	        
	    }
	    
	}
	else {
	    testheight++;
	    int hold=testheight;
	    height(t.getRight());
	    testheight=hold;
	    height(t.getLeft());
	}
        
	
    }
    public int height(node t){
	findheight(t);
	return height;
    }
    public void splitDupes(node t){
	if (t==null){
	    return;
	}		
	if (t.getRight()!=null && t.getData()==t.getRight().getData()){
	    node stuff1 = new node(t.getData()-1);
	    stuff1.setRight(t.getRight());
	    t.setRight(stuff1);
	}
	else if(t.getLeft()!=null && t.getData()==t.getLeft().getData()){
	    node stuff2 = new node(t.getData()-1);
	    stuff2.setLeft(t.getLeft());
	    t.setLeft(stuff2);
	}
	splitDupes(t.getRight());
	splitDupes(t.getLeft());
    }
    public int longest(node t){
	int a = height(t.getLeft());
	int b = height(t.getRight());
	return a+b-1;
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
	System.out.println(t.height(t.r));
	binaryT test2 = new binaryT();
	test2.insert(10);
	test2.insert(1);
	test2.insert(12);
	test2.insert(12);
	System.out.println(test2.height(test2.r));
	test2.splitDupes(test2.r);
	System.out.println(test2.r.getRight().getRight().getData());
    }
}
