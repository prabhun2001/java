
package bpack;
import apack.A;

public class B extends A{
  public void display(){
    System.out.println("IN CLASS B!");

    System.out.println("a = "+geta()+" default uaing geta() function");
    System.out.println("b = "+getb()+" private uaing geta() function");
    System.out.println("c = "+c+" protected");
    System.out.println("d = "+d+" public");
  }
}
