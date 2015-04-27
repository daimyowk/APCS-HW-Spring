public class Driver{
    public static void main(String[] args){
	node use = new node(10);
	binaryT test=  new binaryT(use);
	test.insert(use,5);
	test.insert(use,12);
	test.insert(use,4);
	test.insert(use,6);
	test.insert(use,13);
	test.insert(use,11);
	test.insert(use,15);
	System.out.println(test);
	System.out.println(test.search(use,13));
	System.out.println(test.search(use,17));
	System.out.println(test.search(use,13).getRight());
    }
}
