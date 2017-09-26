import java.util.Scanner;

public class sewingWorkshop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rectangleTable = Integer.parseInt(console.nextLine());
        double lenght = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());
        double usd = 1.85;
        double rectangleArea =rectangleTable*( (lenght+(2*0.3))*(width+(2*0.3)));
        double squareArea = rectangleTable*(lenght/2)*(lenght/2);
        double priceUsd = (rectangleArea*7)+(squareArea*9);
        double priceBgn = priceUsd*usd;
        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN",priceBgn);
    }
}
