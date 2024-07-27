// import java.util.Random;

// class whilel{
//     public static void main(String args[]){

//         Random rand=new Random();

//         int numb=0;

//         while(numb!=5){
//             numb=rand.nextInt(11);
//             System.out.println(numb);
//         }
//     }
// }


//do while condition:


import java.util.Scanner;

public class whilel{
    public static void main(String args[]){
        Scanner rand=new Scanner(System.in);
        int a;

        do{
            System.out.println("Enter the number >10:");
            a=rand.nextInt();
            

    }
        while(a<10);
    }
} 