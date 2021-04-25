import java.util.Scanner;

public class stack {
    int top=-1,max=15;
    int st[]=new int[max];

   void push(int n){
      if(top==max-1){
         System.out.println("\noverload!");
      }else{
         st[++top]=n;
      }
   }
   
   int pop(){
      if(top==-1){
         return -1;

               }else{
         return st[top--];
      }
   }
   
   void display(){
      int t=top;
      if(top==-1){
      System.out.println("no elements!");
      return;
      }
      while(t>-1){
      System.out.println(st[t]);
      t--;
      }
   }
      
   
   public static void main(String[] arg){
      stack s=new stack();
      Scanner read=new Scanner(System.in);
      int i=0,num;
      while(i!=4){
         System.out.println("Enter 1 to push : ");
         System.out.println("Enter 2 to push : ");
         System.out.println("Enter 3 to display : ");
         System.out.println("Enter 4 to exit : ");
         i=read.nextInt();
         switch(i){
            case 1:
            {
               System.out.println("Enter value : ");
               num=read.nextInt();
               s.push(num);
               break;
            }
            case 2:
            {
               num=s.pop();
               if(num==-1){
                  System.out.println("\nunderload!");
               }else{
               System.out.println("the popped value is : "+num);
               }
               break;
               
            }
            case 3:
            {
               s.display();
            }
            
         }
            
                        
         
      }
   }
    
}
