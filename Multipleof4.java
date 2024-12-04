import java.util.*;
public class Multipleof4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&3)==0)
        System.out.println("it is a multiple of 4");
        else
        System.out.println("No it is not a multiple of 4");
         
    }
}