import java.util.*;
class extractdigitsfromnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int c=0;
int m=n;
while(n>0)
{
n=n/10;
c++;
}
while(c!=0)
{
int a=m%10;
System.out.println("number at digit"+c+"is"+a);
m=m/10;
c--;
}
}
}

