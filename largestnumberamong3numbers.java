/*import java.util.*;
class largestamong3numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of ele");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array ele");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int big=a[0];
for(int i=0;i<n;i++){
if(a[i]>big)
{
big=a[i];
}}
System.out.println("big ele="+big);
}}*/
import java.util.*;
class largestamong3numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 st array ele");
int n1=sc.nextInt();
System.out.println("enter 2 st array ele");
int n2=sc.nextInt();
System.out.println("enter 3 st array ele");
int n3=sc.nextInt();
int big=n1;
if(n2>n1 && n2>n3)
{
big=n2;
}
else if(n3>n1 && n3>n2)
{
big=n3;
}
else{
big=n1;
}
System.out.println("largest among 3 numbers="+big);
}
}