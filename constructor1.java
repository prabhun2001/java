public class constructor1{
  int a,b;
  constructor1(){
    a=1;
    b=1;
  }
  void constructor1(){
    a=10;
    b=10;
  }

  public static void main(String[] arg){
    constructor1 c =new constructor1();
    constructor1 c1 = c;
    System.out.println("values of a and b : "+c.a+" "+c.b);
    c1.constructor1();
    System.out.println("values of a and b : "+c.a+" "+c.b);
  }
}
