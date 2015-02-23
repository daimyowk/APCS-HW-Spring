public class knights{
    private String[][]board;
    boolean solved=false;
    int move=1;
    public knights(int x){
	board=new String[x+4][x+4];
	for (int i=0; i< board.length;i++){
	    for (int a=0;a<board[0].length;a++){
		if (a<=1 || a>x+1 || i==0 || i==1 || i==x+3 || i==x+2){
		    board[i][a]="#";
		}
		else{
		    board[i][a]="O";
		}
	    }
	}
    }
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public void show(){
	//String result="";
	for (int i=0; i< board.length;i++){
	    for (int a=0;a<board[0].length;a++){
		//result+=board[i][a];
		System.out.printf("%3s",board[i][a]);
	    }
	    System.out.println();
	    //result+="\n";
	}
	//return result;
    }
    public void solve(int x, int y){
        if (solved||board[x][y]=="#"||board[x][y]=="x"|| !(board[x][y]=="O")){
	    
	    return;
	}
	solved=true;
        for (int i=0; i< board.length;i++){
	    for (int a=0;a<board[0].length;a++){
		if (board[i][a]=="O"){
		    solved=false;
		}
		if (board[i][a]=="x"){
		    board[i][a]="O";
		    move--;
		}
	        
	    }
	}
        System.out.println();
	
	//delay(1000);
	
	this.show();
        board[x][y]="K";
        board[x][y]=""+move;
	move++;
	solve(x+2,y-1);
	solve(x+2,y+1);
	solve(x-2,y+1);
	solve(x-2,y-1);
	solve(x+1,y+2);
	solve(x-1,y+2);
	solve(x+1,y-2);
	solve(x-1,y-2);
        if (!solved){
	    board[x][y]="x";
	    
	}
	if  (solved){
	    this.show();
	    
	}

	 
    }
	
    public static void main(String args[]){
	knights test= new knights(5);
        test.show();
	test.solve(2,2);
	        
    }
    
	
}
