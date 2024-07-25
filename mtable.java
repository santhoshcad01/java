import java.util.*;

public class mtable {
    public static void main(String args[]){
        int mta,limit;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number of multiple table=");
        mta=num.nextInt();
        System.out.println("Enter the limit of the table =");
        limit=num.nextInt();

        for(int i=1;i<=limit;i++)
        {
            System.out.println(i+"*"+mta+"="+i*mta);

        }
    
}
}
