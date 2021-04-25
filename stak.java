import java.util.Scanner;

public class stack {
   int st[]=new int[15];
   int top=-1;
   void push(int n){
      if(top==n-1){
         System.out.println("\noverload!");
      }else{
         st[++top]=n;
      }
   }
   
   int pop(){
      if(top==-1){
         System.out.println("\nunderload!");
      }else{
         return st[top--];
      }
   }
      
   
   public static void main(String[] arg){
      stack s=new stack();
      Scanner read=new Scanner(System.in);
      int i=0,n,num;
      while(i!=3){
         System.out.println("Enter 1 to push : ");
         System.out.println("Enter 2 to push : ");
         System.out.println("Enter 3 to exit : ");
         n=read.nextInt();
         switch(n){
            case 1:
            {
               System.out.println("Enter value : ");
               num=read.nextInt();
               s.push(num);
               break;
            }
            case 2:
            {
               System.out.println("the popped value is : "+s.pop());
               break;
            }
            
         }
            
                        
         
      }
   }
    
}
