import java.util.*;

class matrix{
  int r,c;
  int m[][] = new int[5][5];
  Scanner in=new Scanner(System.in);
  matrix(){

    System.out.println("enter number of rows and columns : ");
    r=in.nextInt();
    c=in.nextInt();
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print("enter m["+i+"]["+j+"] : ");
        m[i][j]=in.nextInt();
      }
    }
  }
  matrix(int r,int c){
    this.r=r;
    this.c=c;
  }
  void display(){
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(m[i][j]+"\t");
      }
      System.out.print("\n");
    }
  }
  matrix mul(matrix m1){
    int sum;
    if(c!=m1.r){
      throw new ArithmeticException();
    }
    matrix res = new matrix(r,m1.c);
    for(int i=0;i<r;i++){
        for(int j=0;j<m1.c;j++){
          sum=0;
          for(int k=0;k<c;k++){
            sum+=m[i][k]*m1.m[k][j];
          }
          res.m[i][j]=sum;
        }
    }
    return res;
  }

}

class matrixmul{
  public static void main(String[] arg){
    matrix m1=new matrix();
    matrix m2=new matrix();
    System.out.println("MATRIX 1");
    m1.display();
    System.out.println("MATRIX 2");
    m2.display();
    matrix m3=new matrix(m1.r,m2.c);
    try{
    m3=m1.mul(m2);
  }
  catch(ArithmeticException e){
    System.out.println("row != col");
  }
    System.out.println("MATRIX AFTER MULTIPLICATION");
    m3.display();
  }
}
