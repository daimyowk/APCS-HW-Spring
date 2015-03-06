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
    public static void main(String args[]){
	selection test= new selection();
	int[] b = new int[]{2,4,1,3,12};
	int[] result= test.pivot(b,0,4);
      	for (int x=0;x<result.length;x++){
	    System.out.print(result[x]+",");
	    
        }
	    System.out.println();
    }
}
