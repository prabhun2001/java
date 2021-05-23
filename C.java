package cpack;
import apack.A;
public class C{
  public void display(){
    A a1=new A();
    System.out.println("a = "+a1.geta()+" default");
    System.out.println("b = "+a1.getb()+" private");
    System.out.println("c = "+a1.c+" protected";
    System.out.println("d = "+a1.d+" public";
  }
}
