import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;
    private myQueue<coor> frontier;
    private coor current;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	frontier=new myQueue<coor>();
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
    public void solve(int x, int y){
        current = new coor(x,y);
	board[x][y]='.';
	if (!(board[x+1][y]==wall) || !(board[x+1][y]==visited)){
	    coor tmp= new coor(x+1,y);
	    frontier.enqueue(tmp);
	}
	if (!(board[x-1][y]==wall) || !(board[x-1][y]==visited)){
	    coor tmp= new coor(x-1,y);
	    frontier.enqueue(tmp);
	}
	if (!(board[x][y+1]==wall) || !(board[x+1][y+1]==visited)){
	    coor tmp= new coor(x,y+1);
	    frontier.enqueue(tmp);
	}
	if (!(board[x][y-1]==wall) || !(board[x][y-1]==visited)){
	    coor tmp= new coor(x,y-1);
	    frontier.enqueue(tmp);
	}
	while (!frontier.empty()){
	    current=frontier.dequeue();
	    board[current.getx()][current.gety()]='.';
	    if (!(board[current.getx()+1][current.gety()]==wall) || !(board[current.getx()+1][current.gety()]==visited)){
		coor tmp= new coor(current.getx()+1,current.gety());
		frontier.enqueue(tmp);
	    }
	    if (!(board[current.getx()-1][current.gety()]==wall) || !(board[current.getx()-1][current.gety()]==visited)){
		coor tmp= new coor(current.getx()-1,current.gety());
		frontier.enqueue(tmp);
	    }
	    if (!(board[current.getx()][current.gety()+1]==wall) || !(board[current.getx()][current.gety()+1]==visited)){
		coor tmp= new coor(current.getx(),current.gety()+1);
		frontier.enqueue(tmp);
	    }
	    if (!(board[current.getx()][current.gety()-1]==wall) || !(board[current.getx()][current.gety()-1]==visited)){
		coor tmp= new coor(current.getx(),current.gety()-1);
		frontier.enqueue(tmp);
	    }
	}
	
    }
		
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
        m.solve(1,1);
	System.out.println(m);
		
    }
}

