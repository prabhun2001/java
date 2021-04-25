class om
{
double m=12;
void incrm()
{
m+=12;
System.out.println("In zero param method: m="+m);
}/*
void incrm(double xx)

{
m+=xx;
System.out.printf("In double param method: m=%.2f\n", m);
}
void incrm(float xx)
{
m+=xx+2;
System.out.printf("In float param method: m=%.2f\n", m);
}
*/
void incrm(int xx)
{
m+=xx;
System.out.println("In int param method: m="+m);
}

void incrm(char xx)
{
m+=xx;
System.out.println("In char param method:m="+m);
}

void incrm(int p1, int p2)
{
System.out.println("In two para method:");
System.out.println(m*p1*p2);
}
}

class methodoverload1
{
public static void main(String sss[])
{
om o1=new om();
o1.incrm(10,20);
o1.incrm();
o1.incrm(10);
char x='i';
o1.incrm(x);
System.out.println((int)x);

o1.incrm(100);
o1.incrm(222);
}
}
//comment int
