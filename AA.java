import java.util.*;
public class AA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if((a<b)&&(a<c)&&(a<d))
        System.out.println("a is small");
        else if((b<a)&&(b<c)&&(b<d))
        System.out.println("b is small");
        else if((c<a)&&(c<b)&&(a<d))
        System.out.println("c is Small");
        else
        System.out.println("d is Small");
    }
}
