//     *
//    **
//   ***
//  ****
// *****
public class RightAlignedRightTraiangle {
    public static void main(String ar[]){
        int i = 1,j,space= 4;
        System.out.println("Your required pattern is:");
        for(i=1 ; i<=5; i++)
        {
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1 ; j<=i ; j++ ){
                System.out.print("*");
            }
            System.out.println("");
            space--;
        }
    }
}
