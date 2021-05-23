import java.util.*;
import java.lang.Math;

abstract class shape{
  abstract void calculateArea();
  abstract void display();
  Scanner in=new Scanner(System.in);
}

class Rectangle extends shape{
  double l,w,area;
  void read(){
    System.out.println("enter length and width : ");
    l=in.nextDouble();
    w=in.nextDouble();
  }
  void calculateArea(){
    area=l*w;
  }
  void display(){
    System.out.println("area of Rectangle : "+area);
  }
}

class circle extends shape{
  double r,area;
  void read(){
    System.out.println("enter radius : ");
    r=in.nextDouble();
  }
  void calculateArea(){
    area=3.14*Math.pow(r,2);
  }
  void display(){
    System.out.println("area of circle : "+area);
  }
}

class triangle extends shape{
  double b,h,area;
  void read(){
    System.out.println("enter height and base : ");
    h=in.nextDouble();
    b=in.nextDouble();
  }
  void calculateArea(){
    area=(b*h)/2;
  }
  void display(){
    System.out.println("area of circle : "+area);
  }
}

class shape_hierarch{
  public static void main(String[] a){
    Rectangle r=new Rectangle();
    circle c=new circle();
    triangle t=new triangle();

    System.out.println("-- RECTANGLE --");
    r.read();
    r.calculateArea();
    r.display();

    System.out.println("-- CIRCLE --");
    c.read();
    c.calculateArea();
    c.display();

    System.out.println("-- TRIANGLE --");
    t.read();
    t.calculateArea();
    t.display();
  }
}
