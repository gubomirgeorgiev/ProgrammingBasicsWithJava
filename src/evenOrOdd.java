import java.util.Scanner;

public class evenOrOdd {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        boolean even = (num%2==0);
        if (even==true){
        System.out.println("even");
        } else System.out.println("odd");
    }
}
