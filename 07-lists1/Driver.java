public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.find(1));
	System.out.println(l.find(5));
	System.out.println(l.find(9));
	l.insert(2,"yo");
	System.out.println(l);
    }
}
