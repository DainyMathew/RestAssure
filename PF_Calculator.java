
import java.util.Scanner;
public class PF_Calculator {


    public static void main(String[] args) {

        double TotalPF,emp_contr,emplr_contr ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Basic Salary of the Employee:");
        double MonthlyIncome = scanner.nextDouble();

        System.out.println("Enter Age of the Employee:");
        int AgeOfEmp = scanner.nextInt();

        if(AgeOfEmp<=50) {
            emp_contr = .15 * MonthlyIncome;
            emplr_contr = .125 * MonthlyIncome;
        }

        else if (AgeOfEmp > 50 && AgeOfEmp <=60) {

            emp_contr = .125 * MonthlyIncome;
            emplr_contr = .10 * MonthlyIncome;
        }

        else  {

            emp_contr = .10 * MonthlyIncome;
            emplr_contr = .075 * MonthlyIncome;
        }
        // Calculate and print TotalPF
        TotalPF=emp_contr+emplr_contr;

        System.out.println("Enmployee's contribution is:" +emp_contr);
        System.out.println("Enmployer's contribution is:" +emplr_contr);
        System.out.println("Total PF is " +TotalPF);


    }
}
