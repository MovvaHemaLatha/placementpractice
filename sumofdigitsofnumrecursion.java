import java.util.*;
class sumofdigitsofnumrecursion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int n=sc.nextInt();
int sum=recur(n);
System.out.println("sum ="+sum);
}
public static int recur(int n)
{
int temp=n%10;
if(n==0)
{
return 0;
}
else{
return temp+recur(n/10);
}
}
}