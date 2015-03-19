import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	Random r = new Random();
	
	l.add(99);
	l.add(90);
	for (int i=0;i<5;i++){
	    l.add(i);
	}
	System.out.println(l);
	System.out.println(l.get(1));
	System.out.println(l.get(5));
	System.out.println(l.get(9));
	l.add(2,77);
	System.out.println(l);
	System.out.println(l.remove(2));
	System.out.println(l);
	l.remove2(3);
	System.out.println(l);
	l.remove2(0);
	System.out.println(l);
	System.out.println();

	//ArrayList
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i=0;i<100000;i++){
	    a.add(r.nextInt(100));
	}
	//System.out.println(a);
	int sum=0;
	long start=System.currentTimeMillis();
	//	System.out.println(start);
	for (int i=0;i<a.size();i++){
	    sum=sum+a.get(i);
	}
        
	long elapsed= System.currentTimeMillis()-start;
	System.out.println("ArrayList 100: "+elapsed); 
	//apprently 0 ms with 100 ints
	//0 ms with 1000
	//2 ms with 10000
	//2 ms with 100000
	//12 ms with 1000000
	
	//My LinkedList
	LList b = new LList();
	for(int i=0;i<100000;i++){
	    b.add(r.nextInt(100));
	}
	int sum2=0;
	long start2=System.currentTimeMillis();
	for (int i=0;i<b.size();i++){
	    sum2=sum2+b.get(i);
	}
        
	long elapsed2=System.currentTimeMillis()-start2;
	System.out.println("my LList 100: "+elapsed2);
	//0 ms with 100 ints
	//15 ms with 1000
	//63 with 10000
	//14746 with 100000
	
	//Java LinkedList
	LinkedList<Integer>c = new LinkedList<Integer>();
	for (int i=0; i<100000;i++){
	    c.add(r.nextInt(100));
	}
	int sum3=0;
	long start3=System.currentTimeMillis();
	for (int i=0;i<c.size();i++){
	    sum3=sum3+c.get(i);
	}
        
	long elapsed3=System.currentTimeMillis()-start3;
	System.out.println("Java LList 100: "+elapsed3);
	//0 ms with 100 ints
	//0 ms with 1000
	//31 ms with 10000
	//6871 with 100000

	//seems ArrayList fastest of the bunch. built in 
	//linkedlist is the next fastest. my linkedlist is slowest
    }
}
