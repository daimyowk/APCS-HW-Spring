import java.io.*;
import java.util.*;

public class MazeStack extends Maze
{ 
   private char[][] board;
    private int maxX;
    private int maxY;
    
    private coor current;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    private myStack<coor> frontier;
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
    public MazeStack(){
        	maxX=40;
	maxY=20;
	frontier=new myStack<coor>();
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
     public void solve(int x, int y){
        current = new coor(x,y);
	board[x][y]='.';
	if (!(board[x+1][y]==wall) || !(board[x+1][y]==visited)){
	    coor tmp= new coor(x+1,y);
	    tmp.setPrev(current);
	    frontier.push(tmp);
	}
	if (!(board[x-1][y]==wall) || !(board[x-1][y]==visited)){
	    coor tmp= new coor(x-1,y);
	    tmp.setPrev(current);
	    frontier.push(tmp);
	}
	if (!(board[x][y+1]==wall) || !(board[x+1][y+1]==visited)){
	    coor tmp= new coor(x,y+1);
	    tmp.setPrev(current);
	    frontier.push(tmp);
	}
	if (!(board[x][y-1]==wall) || !(board[x][y-1]==visited)){
	    coor tmp= new coor(x,y-1);
	    tmp.setPrev(current);
	    frontier.push(tmp);
	}
	System.out.println(frontier);
	while (!frontier.empty()){
	    
	    System.out.println(this);
	    delay(200);
	    //System.out.println();
	    //System.out.println(frontier);
	    current=frontier.pop();
	    //System.out.println(current);
	    if (board[current.getx()][current.gety()]=='$'){
		coor holder=current.getPrev();
	
        
		while(holder.getx()!=x || holder.gety()!=y){
		    // System.out.println("here");
		    //	System.out.println(holder);
		    board[holder.getx()][holder.gety()]='X';
		    holder=holder.getPrev();
		}
		break;
	    }
	    board[current.getx()][current.gety()]='.';
	    if ((current.getx()<maxX-1)&&(!(board[current.getx()+1][current.gety()]==wall) && !(board[current.getx()+1][current.gety()]==visited)&& !(board[current.getx()+1][current.gety()]=='.'))){
		coor tmp= new coor(current.getx()+1,current.gety());
	        tmp.setPrev(current);
		frontier.push(tmp);
	    }
	    if ((current.getx()>0)&&(!(board[current.getx()-1][current.gety()]==wall) && !(board[current.getx()-1][current.gety()]==visited)&& !(board[current.getx()-1][current.gety()]=='.'))){
		coor tmp= new coor(current.getx()-1,current.gety());
	        tmp.setPrev(current);
		frontier.push(tmp);
	    }
	    if ((current.gety()<maxY-1)&&(!(board[current.getx()][current.gety()+1]==wall) && !(board[current.getx()][current.gety()+1]==visited)&& !(board[current.getx()][current.gety()+1]=='.'))){
		coor tmp= new coor(current.getx(),current.gety()+1);
	        tmp.setPrev(current);
		frontier.push(tmp);
	    }
	    if ((current.gety()>0)&&(!(board[current.getx()][current.gety()-1]==wall) && !(board[current.getx()][current.gety()-1]==visited)&& !(board[current.getx()][current.gety()-1]=='.'))){
		coor tmp= new coor(current.getx(),current.gety()-1);
	        tmp.setPrev(current);
		frontier.push(tmp);
	    }
	    
	}
	
    }
    public static void main(String[] args){
	MazeStack m = new MazeStack();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
		
    }
}
