import java.util.*;
class increment1toalldigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int b=0;
while(n>0)
{
int a=n%10;
a++;
b=b*10+a;
n=n/10;
}
n=b;
b=0;
while(n>0)
{
int a=n%10;
b=b*10+a;
n=n/10;
}
System.out.println("after increment"+b);
}
}







