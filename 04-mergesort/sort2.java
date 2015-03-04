import java.util.*;
public class sort2{
     public int[] mergesort(int[] data){
	if (data.length==1 ){
	    return data;
	}
        int[] a =Arrays.copyOfRange(data,0,data.length/2);
        int[] b=Arrays.copyOfRange(data,data.length/2,data.length);
        int[] r1=mergesort( a);
	int[] r2=mergesort( b);
	return merge(r1,r2);
	//System.out.println(r1);
	//System.out.println(r2);

	/*if (a.size()==1 && b.size()==1){
	    return merge(r1,r2);
	}
	else 
	return mergesort(merge(r1,r2));*/
	
    }
    public int[] merge(int[] a, int[] b){
	int[] result = new int[a.length+b.length];
	int resultcount=0;
	int acount=0;
	int bcount=0;
	while(acount<a.length && bcount<b.length){
	    if(a[acount]>b[bcount]){
		result[resultcount]=b[bcount];
		resultcount++;
		bcount++;
	    }
	    else{
		result[resultcount]=a[acount];
		resultcount++;
		acount++;
	    }
	}
	if(acount<a.length){
	    for (int i=acount;i<a.length;i++){
	    result[resultcount]=a[i];
	    resultcount++;
	    }
	}
       if(bcount<b.length){
	    for (int i=bcount;i<b.length;i++){
	    result[resultcount]=b[i];
	    resultcount++;
	    }
	} 
	    
	return result;
    }
    public static void main (String args[]){
	sort2 test = new sort2();
	/*	ArrayList<Integer> a = new ArrayList<Integer>(); 
	a.add(1);
	//	a.add(2);
	//	a.add(5);
	//	a.add(27);
	//	a.add(50);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(2);
		b.add(7);
	//	b.add(23);
	System.out.println(test.merge(a,b));*/
	int[]c = new int[]{1,23,15,67,17,15};
	//ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(23,16,23,65,65,5));
	for (int x=0;x<test.mergesort(c).length;x++){
	    System.out.print(test.mergesort(c)[x]+",");
	}
	System.out.println();
	    
    }
}
