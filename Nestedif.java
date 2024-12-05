import java.util.*;
public class Nestedif{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(a<c)
         System.out.println("a is small");
            else
         System.out.println("c is small");
        }
        else if(b<c)
        {
        System.out.println("b is small");
        }
        else{
            System.out.println("all are  small");

        }

        
    }
}