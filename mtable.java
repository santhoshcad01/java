// import java.util.*;

// public class mtable {
//     public static void main(String args[]){
//         int mta,limit;
//         Scanner num=new Scanner(System.in);
//         System.out.println("Enter the number of multiple table=");
//         mta=num.nextInt();
//         System.out.println("Enter the limit of the table =");
//         limit=num.nextInt();

//         for(int i=1;i<=limit;i++)
//         {
//             System.out.println(i+"*"+mta+"="+i*mta);

//         }
    
// }
// }

// import java.util.*;
// class mtable{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int size=scan.nextInt();
//         int[] num=new int[size];

//         for(int i=0;i<=size;i++){
//             System.out.println(i);
//         }
//     }
// }

//for each method:

// import java.util.*;

// public class mtable{
//     public static void main(String args[]){
        
//         for(int i=0;i<=3;i++)
//         {

//             for(int j=1;j<=2;j++)
//             {
//             System.out.println("john");
//             }

//         }
//     }
// }


// Nested loop to Start problem:

// import java.util.Scanner;
// public class mtable{
//     public static void main(String args[]){
//         int num;
//         Scanner star=new Scanner(System.in);
//         System.out.println("how many stars to show :");
//         num=star.nextInt();
    
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class mtable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n values :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println((i+j)-1+"");
            }
            System.out.println();
        }
    }
}