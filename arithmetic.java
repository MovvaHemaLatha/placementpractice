import java.util.*;
class arithmetic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b");
int a=sc.nextInt();
int b=sc.nextInt();
while(true){
System.out.println("enter 1 for add");
System.out.println("enter 2 for sub");
System.out.println("enter 3 for mul");
System.out.println("enter 4 for div");
System.out.println("enter 5 to exit");
System.out.println("enter your option");
int op=sc.nextInt();
switch(op)
{
case 1:
int sum=a+b;
System.out.println("sum"+sum);
break;
case 2:
int sub=a-b;
System.out.println("sub"+sub);
break;
case 3:
int mul=a*b;
System.out.println("mul"+mul);
break;
case 4:
double div=(double)a/b;
System.out.println("div"+div);
break;
case 5:
System.exit(0);
}
}
}
}