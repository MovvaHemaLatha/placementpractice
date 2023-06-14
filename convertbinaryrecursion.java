import java.util.*;
class convertbinaryrecursion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
convertbinaryrecursion obj=new convertbinaryrecursion(); 
String binary=obj.bin(n);
System.out.println("binary number"+binary);
}
String bin(int x)
{
if(x>0)
{
int a=x%2;
x=x/2;
return a+bin(x);
}
return "";
}
}


