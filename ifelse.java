import java.util.*;
public class ifelse {
    public static void main(String args[]){
      int num1,num2;
      Scanner add=new Scanner(System.in);
      System.out.println("Enter the num1 :");
      num1=add.nextInt();
      System.out.println("Enter the num2 :");
      num2=add.nextInt();
      if(num1>num2){
        System.out.println("num1 is Greater then num2");

      }
      else{
        System.out.println("num2 is Greater then num1");
      }
    }
    
}
