import java.util.*;
class positiveornegative
{
public static void main(String args[])
{
Scanner sc=new scanner(System.in);
int n=sc.nextInt();
System.out.println("enter value you want to check");
if(n>0)
{
System.out.println("positive");
}
elseif(n<0){
System.out.println("negative");
}
else
{
System.out.println("zero");
}
}
}