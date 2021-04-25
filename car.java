import java.util.Scanner;

public class car{
  String model;
  String make;
  int speed;

  car(String model,String make,int speed){
    this.model=model;
    this.make=make;
    this.speed=speed;
  }

  void accelerate(){
    speed+=5;
  }
  void break1(){
    speed-=5;
  }
  void display(){
    System.out.println("\nmodel : "+model);
    System.out.println("make : "+make);
    System.out.println("speed : "+speed);
  }

  public static void main(String[] arg){
    car c;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter details of the car : ");
    System.out.println("Enter the  model : ");
    String model=read.nextLine();
    System.out.println("Enter the  make : ");
    String make=read.nextLine();
    System.out.println("Enter the  speed : ");
    int speed=read.nextInt();

    c=new car(model,make,speed);

    c.accelerate();
    c.accelerate();
    c.accelerate();
    c.accelerate();
    c.accelerate();

    System.out.println("After accelerating 5 times : ");
    c.display();

    c.break1();
    c.break1();
    c.break1();
    c.break1();
    c.break1();
    System.out.println("After break 5 times : ");
    c.display();
  }
}
