package assignment2;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=100, y=200;
       System.out.println("before swap");
       System.out.println("x:"+x);
       System.out.println("y:"+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("after swap.");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
	}

}
