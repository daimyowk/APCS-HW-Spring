public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
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
    }
}
