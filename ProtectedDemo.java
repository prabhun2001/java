package dpack;
import bpack.B;
import cpack.C;
class ProtectedDemo{
  public static void main(String[] a){
    B b1=new B();
    C c1=new C();

    b1.display();
    c1.display();
  }

}
