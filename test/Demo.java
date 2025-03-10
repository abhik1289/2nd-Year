

import geometry.Circle;

public class Demo {
public static void main(String[] args){
    Circle c= new Circle();
    c.setRadius(5);
    System.out.println("Radius: "+c.getRadius());
    System.out.println("Area: "+c.getArea());
    System.out.println("Perimeter: "+c.getPerimeter());
}    
}
