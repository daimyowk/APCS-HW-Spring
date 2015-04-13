import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    private Frontier f;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void addToFront(int tx,int ty, Node current){
	Node tmp=null;
	if (board[tx][ty]=='#' || board[tx][ty]=='$'){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }
    }
    public void bfs(int x, int y){
	Frontier f= new Frontier();
	f.add(new Node(x,y));
	Node tmp = null;
	int tx=0,ty=0;
	Node current;
	while(!f.isEmpty()){
	     current = f.remove();
	    int cx= current.getX();
	    int cy= current.getY();
	    board[cx][cy]='z';
	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);
	    delay(50);
	    System.out.println(this);
	    
	    
	}
	for (Node p=current.getPrev(); p!=nll; p=p.getPrev()){
	    board[p.getX()][p.getY()]='P';
	    delay(100);
	    System.out.println();
	}
    }
    public void solve(int x, int y){
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}

	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	if (!solved){
	    board[x][y]=visited;
	}
    }
		
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
       m.bfs(1,1);
	System.out.println(m);
		
    }
}

