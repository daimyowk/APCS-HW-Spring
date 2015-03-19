/piggy backing pointers
public boolean remove(int n){
    Node T=l.getNext();
    Node T2 =l;
    while(T!=null){
	if (T.getData()=n){
	    T2.setNext(T.getNext());
	    return true;
	}
	T2=T;
	T=T.getNext();
    }
}

//LinkedList n^2
//no instant access
//
