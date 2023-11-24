package pinaki_1;

public class ass1
{
 public int mult(int a,int b)
{
int c;
c=a*b;
System.out.println("multi" +c);
return c;
}
public int sub(int d ,int e)
{
int f;
f=d-e;
System.out.println("sub" +f);
return f;
}
public int sum1(int h,int o)
{
int s;
s=h+o;
System.out.println("sum1" +s);
return s;
}
public int sub1(int p,int l)
{
int g;
g=p-l;
System.out.println("sub1" +g);
return g;
}
public int div (int k,int y)
{
int n;
n=k/y;
System.out.println("div" +n);
return n;
}
public static void main(String[] args)
{
ass1 cal=new ass1();
int mult=cal.mult(10, 2);
int sub=cal.sub(mult, 2);
int sum1=cal.sum1(sub,2);
int sub1=cal.sum1(sum1,2);
cal.div(sub1,2);
}
}

