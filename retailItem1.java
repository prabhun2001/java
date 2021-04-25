import java.util.Scanner;

class retailItem1{
    String Description;
    int Units;
    double Price;

    public void setretailItem(String d,int u,double p){
        Description=d;
        Units=u;
        Price=p;
    }
    public String getDescription(){
        return Description;
    }
    public int getunit(){
        return Units;
    }
    public double getPrice(){
        return Price;
    }

    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of items : ");
        int n=in.nextInt();

        retailItem1 r[]=new retailItem1[n];

        for(int i=0;i<n;i++){
            r[i]=new retailItem1();
            System.out.println("Enter the Description,Units and Price of item :");
            String description=in.next();
            int unit=in.nextInt();
            double price=in.nextDouble();

            r[i].setretailItem(description,unit,price);
        }
        for(int i=0;i<n;i++){

            System.out.println("\nDescription of item : "+r[i].getDescription());
            System.out.println("Units : "+r[i].getunit());
            System.out.println("Price : "+r[i].getPrice());
        }


    }
}
