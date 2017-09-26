import java.util.Scanner;

public class greaterNumber {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 =Integer.parseInt(console.nextLine());
        int num2 =Integer.parseInt(console.nextLine());
        boolean num1IsGreater = (num1>num2);
        if (num1IsGreater==true){
            System.out.println(num1);
        }else System.out.println(num2);
    }
}
