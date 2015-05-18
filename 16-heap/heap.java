import java.util.*;
import java.io.*;
//insert and siftup done in class with Leon Cheng
public class heap{
   
    private ArrayList<Integer> data;
   
    public heap(){
      
	data = new ArrayList<Integer>(); 
    }
   
    //write heapsort
    public void insert(int n){
	data.add(n);
	siftUp(n);
    }  
    
    public void siftUp(int x){
	int child = data.indexOf(x);
	int parentIndex=child/2;
	while (data.get(parentIndex)>data.get(child)){
	    int tmp = data.get(parentIndex);
	    data.set(parentIndex,data.get(child));
	    data.set(child,tmp);
	    child = parentIndex;
	    parentIndex = parentIndex/2;
	}
    }   
    public String toString(){
	return data+"";
    }
    public int findmin(){
	return data.get(0);
    }
    public void removemin(){
	data.set(0,data.get(data.size()-1));
	pushdown(data.get(0));
	data.remove(data.size()-1);
    }
    public void pushdown(int x){
	int parent = data.indexOf(x);
	int child1 = parent*2;
	int child2 = parent*2+1;
	if (child1>data.size()-1 || child2>data.size()-1){
	    return;
	}
	while ((data.get(parent)>data.get(child1) || data.get(parent)>data.get(child2)) && (child1<data.size() && child2<data.size())){
	    int tmp;
	    if (data.get(child1)>data.get(child2)){
		tmp=data.get(child2);
		data.set(child2,data.get(parent));
		data.set(parent,tmp);
		parent=child2;
		child1=parent*2;
		child2=parent*2+1;
		if (child1>data.size()-1 || child2>data.size()-1){
		    return;
		}
	    }
	    else {
		tmp=data.get(child1);
		data.set(child1,data.get(parent));
		data.set(parent,tmp);
		parent=child1;
		child1=parent*2;
		child2=parent*2+1;
		if (child1>data.size()-1 || child2>data.size()-1){
		    return;
		}
	    }
	    
	}

    }
    public void heapsort(){
	/*	for (int x=0;x<data.size();x++){
	    pushdown(data.get(x));
	    }*/
    }
 
   
    public static void main (String[] args) {
	heap h = new heap();
	h.insert(200);
	h.insert(213);
	h.insert(201);
	h.insert(13);
	h.insert(25);
	h.insert(24);
	h.insert(2141);
	h.insert(290);
	h.insert(251);
	System.out.println(h);
	h.removemin();
	System.out.println(h);
	h.heapsort();
	System.out.println(h);
    }
} 
