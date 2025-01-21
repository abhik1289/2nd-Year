import java.util.Scanner;

class Rectangle {
	private double breadth;
	private double length;

	Rectangle(double breadth, double length) {
		this.breadth = breadth;
		this.length = length;
	}

	void read() {
		System.out.println("Length is: " + length);
		System.out.println("Breadth is: " + breadth);

	}

	void calculate() {
		double ans = breadth * length;
		System.out.println("Area is: " + ans);
	}

	void display() {
		read();
		calculate();
	}

}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length is: ");
		double length = sc.nextDouble();
		System.out.println("Breadth is: ");
		double breadth = sc.nextDouble();
		Rectangle r1 = new Rectangle(breadth,length);
		r1.display();
	}

}
