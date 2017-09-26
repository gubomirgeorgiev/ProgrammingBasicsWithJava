import java.util.Scanner;

public class inchesToCentimeters {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = 2.54;
        System.out.println(a*b);
    }
}
