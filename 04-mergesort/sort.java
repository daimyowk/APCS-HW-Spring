import java.util.*;
public class sort{
    public ArrayList<Integer> mergesort(ArrayList<Integer> data){
	if (data.size()==1){
	    return data;
	}
        ArrayList<Integer> a =new ArrayList<Integer>(data.subList(0,data.size()/2));
	ArrayList<Integer> b=new ArrayList<Integer>(data.subList(data.size()/2+1,data.size()));
	ArrayList<Integer> r1=mergesort( a);
	ArrayList<Integer> r2=mergesort( b);
	if (a.size()==1 && b.size()==1){
	    return merge(r1,r2);
	}
	else 
	return mergesort(merge(r1,r2));
	//return merge(r1,r2);
    }
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while(a.size()>0 && b.size()>0){
	    if(a.get(0)>b.get(0)){
		result.add(b.remove(0));
	    }
	    else{
		result.add(a.remove(0));
	    }
	}
	if(a.size()>0){
	    for (int i=0;i<a.size();i++){
		result.add(a.remove(i));
	    }
	}
	if(b.size()>0){
	    for (int i=0;i<b.size();i++){
		result.add(b.remove(i));
	    }
	}
	    
	return result;
    }
    public static void main (String args[]){
	sort test = new sort();
	ArrayList<Integer> a = new ArrayList<Integer>(); 
	a.add(1);
	a.add(2);
	a.add(5);
	a.add(27);
	a.add(50);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(2);
	b.add(7);
	b.add(23);
	System.out.println(test.merge(a,b));
	ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(23,16,23,65,234));
	System.out.println(test.mergesort(c));
    }
}
    
