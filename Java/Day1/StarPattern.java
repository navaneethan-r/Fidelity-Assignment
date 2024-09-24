import java.util.*;
public class StarPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

