import java.util.*;
class multiplicationtable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
for(int i=1;i<11;i++)
{
int m=n*i;
System.out.println(n+" x "+i+"="+m);
}
}
}



