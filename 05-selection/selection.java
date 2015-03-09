public class selection{
    public int[] pivot(int[] L,int SI,int EI){
	int holder1 = SI;
	int holder2 = EI;
	int[] D= new int[L.length];
	for (int x=0;x<L.length;x++){
	    if (x<SI || x>EI){
		D[x]=L[x];
	    }
	}
	int pivot=L[SI];
	holder1++;
	
        for (int x=holder1;x<holder2+1;x++){
	    //System.out.println(x);
	    if(L[x]<pivot){
		D[SI]=L[x];
		SI++;
	    }
	    if(L[x]>pivot){
		D[EI]=L[x];
		EI--;
	    }
	    if(EI==SI){
		D[SI]=pivot;
	    }
		   
	}
        
	return D;
	 
	    
    }
    /* notes
       3,8,16,4,6,2,5,9,7,12
       L and H are limits for selection like binary search
       starts with them at 0 and a.length-1
       L or H change in each recursive call
       1.select pivot value
        shoule A[L];
       2.no create new array
       move pivot value to end
       6 a[4]
       swap A[H] and A[Pi]
       3. Li=L, Hi=H-1
       4.While Hi>Li
       if A[Li]<P {Li++}
       if A[Li]>P {swap A[Li] and A[Hi] then H-- DO NOT MODIFY LI BECAUSE
       NOT CHECKED
       eventually Hi=Li;
       use if to check the element at Hi/Li
       if A[Li] >P{swap A[Li] with A[Pi]  update Pi}
       else swap A[Li++] with A[Pi] update Pi

       if k==Pi {DONE}
       else select (A,K,0,Pi-1) or (A,K,Pi+1,Hi)*/
    public void swap(int[] data,int place1, int place2){
	int holder1=data[place1];
	int holder2=data[place2];
	data[place2]=holder1;
	data[place1]=holder2;
    }
    public int select(int[] A, int k, int l, int h){
	int high=h-1;
	int low=l;
	int pI = l;
	int pivot=A[pI];       
	swap(A,pI,h);
	pI=h;
	while (high>low){
	    if (A[low]<pivot){
		low++;
	    }
	    if (A[low]>pivot){
		swap(A,low,high);
		high--;
	    }
	}       
	if (A[low]>pivot){
	    swap(A,low,pI);
	    pI=low;
	}
	else if (A[low]<pivot){  
	    swap(A,low+1,pI);
	    pI=low+1;
	}
	if (k==pI){
	    return A[k];
	}
	else if (k<pI){
	    select(A,k,0,pI-1);
	}
	else {
	    
	    select(A,k,pI+1,h);
	}
	return A[k];
    }
    public static void main(String args[]){
	selection test= new selection();
	int[] b = new int[]{2,4,1,3,12,5,9};
	/*	int[] result= test.pivot(b,0,4);
      	for (int x=0;x<result.length;x++){
	    System.out.print(result[x]+",");
	    
        }
	System.out.println();*/
	System.out.println(test.select(b,4,0,b.length-1));
    }
}
