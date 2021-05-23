import java.util.*;

class temperature{
  float temp;
  Scanner in=new Scanner(System.in);
  void read(){
    System.out.println("enter temperature in celsius : ");
    temp=in.nextFloat();
    if(temp == 0){
      throw new MyException("temperature is "+temp+"degree celsius");
    }
  }
  void display(){
    System.out.println("temperature is not zero");
    System.out.println("temperature = "+temp+"degree celsius");
  }
  public static void main(String[] a){
    temperature t=new temperature();
    t.read();
    t.display();
  }
}

class MyException extends RuntimeException{
  MyException(String s){
    super(s);
  }
}
