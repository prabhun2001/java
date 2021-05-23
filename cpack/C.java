package cpack;
import apack.A;
public class C{
  public void display(){
    A a1=new A();
    System.out.println("IN CLASS C!");

    System.out.println("a = "+a1.geta()+" default uaing geta() function");
    System.out.println("b = "+a1.getb()+" private uaing getb() function");
    System.out.println("c = "+a1.getc()+" protected uaing getc() function");
    System.out.println("d = "+a1.d+" public");
  }
}
