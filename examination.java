import java.util.*;

class  Student{
  int rollno;
  String name;
  Student(){
    rollno=0;
    name="NULL";
    System.out.println(" : STUDENT DETAILS :");
  }
  Scanner read = new Scanner(System.in);
}

class Exam extends Student{
  int[] marks=new int[6];
  Exam(){
    super();
  }
  void read(){
    System.out.println("Enter name : ");
    name=read.nextLine();
    System.out.println("Enter Roll number : ");
    rollno=read.nextInt();
    System.out.println("Enter marks : ");
    for(int i=0;i<6;i++){
      System.out.print("subject "+(i+1)+" : ");
      marks[i]=read.nextInt();
    }
  }
}

class Result extends Exam{
  int total_marks=0;
  double percentage;
  Result(){
    super();
  }
  void calc(){
    for(int i=0;i<6;i++){
      total_marks+=marks[i];
    }
    System.out.println("total marks : "+total_marks);
  }
  void percent(){
    percentage=((float)total_marks/600)*100;
    System.out.println("percentage : "+percentage+"%");
  }
}

class examination{
  public static void main(String[] a){
    Result s1 =new Result();
    s1.read();
    s1.calc();
    s1.percent();
  }
}
