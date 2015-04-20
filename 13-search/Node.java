import java.io.*;
import java.util.*;

public class Node {
    private int x,y;
    private Node prev;
    private double priority;
    private int exitx,exity;
		
    public Node(int x, int y, int exitx, int exity){
	this.x = x;
	this.y = y;
	this.exitx=exitx;
	this.exity=exity;
	priority = Math.sqrt(Math.abs(exitx-x)+Math.abs(exity-y));
	//priority = Math.abs(exitx-x)+Math.abs(exity-y);
    }
    public double getPriority(){
	return priority;
    }
    public void setPriority(double n){
	priority=n;
    }
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
		
}










