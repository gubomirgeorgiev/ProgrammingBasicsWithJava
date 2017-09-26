import java.util.Scanner;

public class dailyIncome {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int workingDays = Integer.parseInt(console.nextLine());
        double dailyIncomes = Double.parseDouble(console.nextLine());
        double usdBgnRate = Double.parseDouble(console.nextLine());
        double monthlySallary = workingDays*dailyIncomes;
        double yearIncome = (monthlySallary*12)+(monthlySallary*2.5);
        double taxes = yearIncome*0.25;
        double neto = (yearIncome-taxes)*usdBgnRate;
        System.out.printf("%.2f",neto/365);
    }
}
