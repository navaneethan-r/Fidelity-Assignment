import java.util.*;
public class EligibleToVote {

    public String isEligible(int age)
    {
        String res = (age>=18) ? "Eligible" : "Not Eligible";
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        EligibleToVote obj = new EligibleToVote();
        String result = obj.isEligible(age);
        System.out.println(result);
        sc.close();
    }
}
