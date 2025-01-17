import java.util.Scanner;
class Reacangle {
	private double breadth;
	private double length;
	
	void read(){
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+ breadth);
		
	}
	void calculate(){
		double ans = breadth*length;
		System.out.println("Area is",ans);
	}
	void display(){
		read();
		calculate();
	}
	
}

public class Question2 {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Length is: ");
		double length = sc.nextDouble();
		System.out.println("Breadth is: ");
		double length = sc.nextDouble();
	}
    
}
