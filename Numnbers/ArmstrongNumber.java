import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the number");
       int n=sc.nextInt();
        int sum=0,rem,num_copy;
        num_copy=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10 + rem*rem*rem;
            n/=10;
        }
        if(sum==num_copy)
        {
            System.out.println("This is a Armstrong Number");
        }
        else{
            System.out.println("This is not a Armstrong number");
        }
    }
}
