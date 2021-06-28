import java.util.*;
class Biggest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of a and b");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("\n\t\t\t\tHERE a="+a+"\tb="+b);
System.out.println("\t\t\t\t****Method One (if statements)****");
if(a>b)
System.out.println("\t\t\t\ta is big");
else
System.out.println("\t\t\t\tb is big");
System.out.println("\n\t\t\t\t******************\n");
System.out.println("\t\t\t\t****Method Two (Conditional Operators)****");
int big=(a>b)?a:b;
System.out.println("\t\t\t\tThe Biggest Number is:"+big);
System.out.println("\n\t\t\t\t******************\n");
System.out.println("\t\t\t\t****Method Three (Math Package $ max method)****");
System.out.println("\t\t\t\tThe Biggest Number between a and b is :"+Math.max(a,b));
}
}