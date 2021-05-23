import java.util.*;

class Fruit{
  float unitprice;
  int quantity;
  Scanner in=new Scanner(System.in);
  void totalcost(){
    System.out.println("total cost : "+unitprice*quantity);
  }
  void readData(){
    System.out.println("enter unitprice : ");
    unitprice=in.nextFloat();
    System.out.println("enter quantity : ");
    quantity=in.nextInt();
  }
  void display(){
    System.out.println("unitprice : "+unitprice);
    System.out.println("quantity : "+quantity);
  }
}

class Mango extends Fruit{
  String name;
  String taste;
  void readData(){
    System.out.println("enter name : ");
    name=in.next();
    System.out.println("enter taste : ");
    taste=in.next();
    super.readData();
  }
  void display(){
    System.out.println("name : "+name);
    System.out.println("taste : "+taste);
    super.display();
    totalcost();
  }

  void makejuice(){
    System.out.println("Mango juice is ready to serve ");
  }
}

class fruit_inh{
  public static void main(String[] a){
    int p=0;
      Scanner in=new Scanner(System.in);
    Mango m=new Mango();
    System.out.println("Enter DETAILS of Mango Fruit : ");
    m.readData();
    while(p!=4){
      System.out.println("\n1-totalcost of all mangos");
      System.out.println("2-display all details");
      System.out.println("3-makejuice");
      System.out.println("4-Exit");
      p=in.nextInt();
      switch(p){
        case 1:
        {
        m.totalcost();
          break;
        }
        case 2:{
          m.display();
          break;
        }
        case 3:{
          m.makejuice();
          break;
        }

      }
    }

  }
}
