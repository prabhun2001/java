import java.util.*;

class A{
  private int a,b;
  protected float x,y;
  public int m,n;
  A(){
    System.out.println("Default Constructor of A!");
    a=0;
    b=0;
  }
  A(int a,int b){
    this.a=a;
    this.b=b;
  }
  Scanner in=new Scanner(System.in);
  final void read(){
    System.out.println("enter a and b (int) : ");
    a=in.nextInt();
    b=in.nextInt();
  }
  final void display(){
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
}

class B extends A{
  B(){
      System.out.println("default Constructor of B!");
      x=0;
      y=0;
  }
  B(int a,int b){
    super(a,b);
  }
  void input(){
    super.read();
    System.out.println("enter x and y (float) :");
    x=in.nextFloat();
    y=in.nextFloat();
  }
  void output(){
    super.display();
    System.out.println("x = "+x);
    System.out.println("y = "+y);
  }

}

final class C extends B{
  C(){
    System.out.println("default Constructor of C!");
    m=0;
    n=0;
  }
  C(int a,int b){
    super(a,b);
  }
  void input(){
    super.input();
    System.out.println("enter m and n (int) :");
    m=in.nextInt();
    n=in.nextInt();
  }
  void output(){
    super.output();
    System.out.println("m = "+m);
    System.out.println("n = "+n);
  }
}

final class D extends B{
  D(){
    System.out.println("default Constructor of D!");
    m=0;
    n=0;
  }
  D(int a,int b){
    super(a,b);
  }
  void input(){
    super.input();
    System.out.println("enter m and n (int) :");
    m=in.nextInt();
    n=in.nextInt();
  }
  void output(){
    super.output();
    System.out.println("m = "+m);
    System.out.println("n = "+n);
  }
}

class hibridinh1{
  public static void main(String[] args){
    A a1 = new C(10,20);
    a1.display();
    B a2 = new D();
    a2.input();
    a2.output();
  }
}
