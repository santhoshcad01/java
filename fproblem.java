import java.lang.System;
import java.util.Scanner;

public class fproblem{
public static void main(String args[])
{
Scanner num=new Scanner(System.in);

System.out.println("Enter the Any Number");

int n=num.nextInt();

if(n%2 !=0)
{
System.out.println("Wried1");
}

else{
if(n>=2 && n<=5)
{
System.out.println("not Wried2");
}
else if(n>=6 && n<=20)
{
System.out.println("Wried4");
}
else {
System.out.println("not Wried6");
}
}
}}