import com.example.payrollmanagementsystem.Employee;
import com.example.payrollmanagementsystem.Permanent;
import com.example.payrollmanagementsystem.Temporary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee per = new Permanent(1,"Navaneethan",25000, 1500);
        Employee temp = new Temporary(2, "Suriya", 1500, 20);

        per.payrollDisplay();
        temp.payrollDisplay();
    }
}