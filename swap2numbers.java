import java.util.*;
class swap2numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st num:");
int n1=sc.nextInt();
System.out.println("enter 2nd num:");
int n2=sc.nextInt();
int temp;
temp=n1;
n1=n2;
n2=temp;
System.out.println("after swapping");
System.out.println("1st num:"+n1);
System.out.println("2nd num:"+n2);
}
}






