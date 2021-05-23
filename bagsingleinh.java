import java.util.*;

class Bag{
  String contents[] = new String[25];
  int itemCount=0;
  Scanner in=new Scanner(System.in);

  void put(){
      if(itemCount>5){
         return;
      }
      System.out.println("Enter iterms : ");

      contents[itemCount]=in.next();
      itemCount++;

  }
  boolean isEmpty(){
    if(itemCount==0){
      return true;
    }else{
      return false;
    }
  }

  boolean isFull(){
    if (itemCount==25) {
      return true;
    }else{
      return false;
    }
  }

  boolean isExist(String item ){
    int i,flag=0;
    for(i=0;i<itemCount;i++){
      if(contents[i].equals(item)){
        flag=1;
        break;
      }
    }
    if(flag==1)
      return true;
    else
      return false;
  }
}



class HandBag extends Bag{
  int Maxitems=6;
  boolean isFull(){
    if(itemCount>=Maxitems){
      return true;
    }else{
      return false;
    }
  }
}

class bagsingleinh{
  public static void main(String[] a){
    Scanner in=new Scanner(System.in);
    HandBag h1=new HandBag();
    int p=0;
    String ele;
    while(p!=5){
      System.out.println("\n1-put");
      System.out.println("2-isEmpty");
      System.out.println("3-isfull");
      System.out.println("4-isExist");
      System.out.println("5-Exit");
      p=in.nextInt();
      switch(p){
        case 1:
        {
          h1.put();
          System.out.println("isFull : "+h1.isFull());
          break;
        }
        case 2:{
          System.out.println(h1.isEmpty());
          break;
        }
        case 3:{
          System.out.println(h1.isFull());
          break;
        }
        case 4:{
          System.out.println("Enter an element to check : ");
          ele=in.next();
          System.out.println(h1.isExist(ele));
          break;
        }
      }
    }
  }
}
