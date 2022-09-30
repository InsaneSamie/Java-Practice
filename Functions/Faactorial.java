import java.util.*;
public class Faactorial {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number to find factorial");
        int num = sc.nextInt();

        System.out.println("Factorial of thee number is:" + fact(num));

    }
    public static int fact(int num)
    {
        int prod=1;
        for(int i=num;i>=1;i--)
        {
            prod=prod*i;
        }
        return prod;
    }
}
