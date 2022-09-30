import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Add(a , b);
        System.out.println("Sum of two numbers is "+result);
    }

    public static int Add(int a, int b){
        int result = a + b;
        return result;
    }


}
