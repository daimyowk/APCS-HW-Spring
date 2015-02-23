public class knights{
    private int[][]board;
    public knights(int x){
	board=new int[x+3][x+3];
	for (int i=0; i< board.length;i++){
	    for (int a=0;a<board[0].length;a++){
		if (a<=1 || a>x){
		    board[i][a]=-1;
		}
	    }
	}
    }

    public String toString(){
	String result="";
	for (int i=0; i< board.length;i++){
	    for (int a=0;a<board[0].length;a++){
		result+=board[i][a];
	    }
	    result+="\n";
	}
	return result;
    }
   
    public static void main(String args[]){
	knights test= new knights(5);
	System.out.println(test);
    }
    
	
}
