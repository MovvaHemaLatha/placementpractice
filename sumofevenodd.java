//sum of even odd
import java.util.*;
class sumofevenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int even=0,odd=0;
System.out.println("enter no.of ele in array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array ele");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
even=even+a[i];
}
else{
odd=odd+a[i];
}
}
System.out.println("even="+even);
System.out.println("odd="+odd);
}}
