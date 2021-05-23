import java.lang.*;
class studentdatabase
{
   String name;
   int marks[] = new int[6];
   void output() 
   {
      double avg,per;
      int total=0;
      for (int i = 0; i < 6; i++) 
      {
         total = total+marks[i];
      }
      avg = total/6.0;
      System.out.println("\nName : " + name);
      for(int i=0;i<6;i++)
      {
         System.out.println("Subject "+(i+1)+" = "+marks[i]);
      }
      System.out.println("AVERAGE Marks : " + avg);
      per=avg/6;
      System.out.println("percentage : " + per);
   }
   public static void main(String args[])
   {
      studentdatabase obj=new studentdatabase();
      String s;
      int l;
      try
      {
         if(args.length != 7)
         {
            throw new MyException("You have entered the wrong input!! \n");
         }
         obj.name=args[0];
         for(int i=0;i<6;i++)
         {
            l=Integer.parseInt(args[i+1]);
            if(l>=0 && l<=50)
            {
               obj.marks[i]=l;
            }
            else
            {
               s="Range Exception \n*Marks should be in the range 0-50*";
               throw new MyException(s);
            }
         }
         obj.output();
      }
      catch(MyException e)
      {
         System.out.println(e.getMessage());
      }
   }
}
class MyException extends Exception
{
   MyException(String s)
   {
      super(s);
   }
}
