import java.util.*;
public class PassingArray {

    public double AverageCalc(int[] nums)
    {
        int numbers[] = nums;
        int sum = 0;
        double average = 0;
        for(int number : numbers)
        {
            sum = sum + number;
        }
        average = sum/numbers.length;
        return average;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array : ");
        int arrLength = sc.nextInt();
        int nums[] = new int[arrLength];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        PassingArray obj = new PassingArray();
        double result = obj.AverageCalc(nums);
        System.out.println(result);
        sc.close();
    }
}
