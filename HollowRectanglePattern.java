
class HollowRectanglePattern{
    public static void main(String[] args)
    {
   
        int j,col;
        for(int i=1;i<=6;i++)
        {
            for(j=1;j<=10;j++)
            {
                System.out.print("*");
                if(i>=2 || i<=5  )
                {
                    System.out.print(" ");
                }
            }
        }
    }
}