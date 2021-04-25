class Adder
{
static int add(int a, int b){return a+b;}
static int add(int a, int b, int c){return a+b+c;}
}
class methodoverload
{
public static void main(String[] args)
{
System.out.println(Adder.add(11,11));//sttic functions can be called using class name

System.out.println(Adder.add(11,11,11));
}
}
