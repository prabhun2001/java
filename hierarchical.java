import java.lang.Math;
import java.util.*;

abstract class Shape{
  Scanner in=new Scanner(System.in);
  double r,h,b,a,Carea;
  abstract void S_read();
  void C_area(){
    Carea=3.14*(Math.pow(r,2));
  }
  abstract void display();
}

interface Ipoint{
  double x=(3*(Math.sqrt(3)))/2;
  public void I_area();
}

class tringle extends Shape implements Ipoint{
  double Tarea;
  void S_read(){
    System.out.println("enter height and base : ");
    h=in.nextDouble();
    b=in.nextDouble();
  }
  public void I_area(){
    Tarea=(h*b)/2;

  }
  void display(){
    System.out.println("area of tringle is : "+Tarea);
  }
}

class hexagon extends Shape implements Ipoint{
  double Harea;
  void S_read(){
    System.out.println("enter side : ");
    a=in.nextDouble();
  }
  public void I_area(){
    Harea=x*(Math.pow(a,2));
  }
  void display(){
    System.out.println("area of hexagon is : "+Harea);
  }
}

class circle extends Shape{

  void S_read(){
    System.out.println("Enter radius : ");
    r=in.nextDouble();
  }
  void display(){

  }
}

class threeDcircle extends circle{
  double Sarea;
  void S_area(){
    Sarea=4*Carea;
  }
  void display(){
    System.out.println("area of Circle is : "+Carea);
    System.out.println("area of threeDcircle is : "+Sarea);
  }
}

class hierarchical{
  public static void main(String[] a){
    System.out.println("\nTRIANGLE : ");
    tringle t=new tringle();
    t.S_read();
    t.I_area();
    t.display();

    System.out.println("\nCIRCLE and threeDcircle  : ");
    threeDcircle c=new threeDcircle();
    c.S_read();
    c.C_area();
    c.S_area();
    c.display();

    System.out.println("\nHEXAGON : ");
    hexagon h=new hexagon();
    h.S_read();
    h.I_area();
    h.display();


  }
}
