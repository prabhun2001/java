import java.util.*;

class arithmaticexcep{
  public static void main(String[] arg){
    int a=8,b=0,c;
    try{
      c=a/b;
    }
    catch(Exception e){
  e.printStackTrace();
      b=2;
      c=a/b;
    }
    System.out.println(c);
  }
}
