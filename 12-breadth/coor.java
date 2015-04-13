public class coor{
    int xcor;
    int ycor;
    coor previous;
    public coor(int x, int y){
	xcor=x;
	ycor=y;
    }
    public int getx(){
	return xcor;
    }
    public int gety(){
	return ycor;
    }
    public void setPrev(coor e){
	previous=e;
    }
    public coor getPrev(){
	return previous;
    }
    public String toString(){
	String s="("+xcor+","+ycor+")";
	return s;
    }
}
