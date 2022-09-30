import java.util.*;
class PerfectNumber{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt(),sum=0;
        for(int i = 1; i< num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a Pefect Number");     
        }
        else{
            System.out.println(num +" is not a Pefect Number");       

        }
    }

}