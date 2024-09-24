import java.util.*;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array : ");
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of even numbers in an array : " + sum);
        sc.close();
    }
}
