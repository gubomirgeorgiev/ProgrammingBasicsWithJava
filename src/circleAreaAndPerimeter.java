import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class circleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        double area = Math.PI*Math.pow(r,2);
        double perimeter = 2*r*Math.PI;
        System.out.printf("area = %f%nperimeter = %f",area,perimeter);
    }
}
