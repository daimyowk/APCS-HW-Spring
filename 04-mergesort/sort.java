public class sort{
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while(a.size()>0 || b.size()>0){
	    if(a.get(0)>b.get(0)){
		result.add(b.remove(0));
	    }
	    else{
		result.add(a.remove(0));
	    }
	}
	if(a.size()>0){
	    
	return result;
    }
    public static void main (String args[]){
	sort test = new sort();
	ArrayList<Integer> a = {1,2,5,37,47};
	ArrayList<Integer> b = {2,8,23};
    }
}
    
