import java.util.Scanner;

public class invoke{
  public static void main(String[] arg){
    retailItem r1=new retailItem();
    String des;
    int unit;
    double price;
    System.out.println("Enter Description,units,Price of item : ");
    Scanner input=new Scanner(System.in);
    des = input.nextLine();
    unit=input.nextInt();
    price=input.nextDouble();

    r1.setretailItem(des,unit,price);
    System.out.println("Description of item : "+r1.getdescription());
    System.out.println("Units : "+r1.getunit());
    System.out.println("Price : "+r1.getprice());

  }
}


class retailItem{

  String Description;
  int Unit;
  double Price;
  void setretailItem(String d,int u,double p){
    Description=d;
    Unit=u;
    Price=p;
  }
  String getdescription(){
    return Description;
  }
  int getunit(){
    return Unit;
  }
  double getprice(){
    return Price;
  }
}
