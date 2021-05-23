import java.lang.Math;
import java.util.*;

class MyException extends RuntimeException{
  MyException(String s){
    super(s);
  }
}


class outofrangeexception{
  float n;
  Scanner in=new Scanner(System.in);
  void read(){
    System.out.println("enter a number : ");
    n=in.nextFloat();
    if(n <10 || n > 50){
      throw new MyException(n+" is out of range");
    }
  }
  void square(){
    System.out.println("square of "+n+" is "+Math.pow(n,2));
  }

  public static void main(String[] a){
    outofrangeexception obj = new outofrangeexception();
    obj.read();
    obj.square();
  }
}

