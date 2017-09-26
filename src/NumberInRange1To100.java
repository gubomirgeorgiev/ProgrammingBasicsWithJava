import java.util.Scanner;

public class NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lenght = 999;
        for (int i = 1; i < lenght; i++) {
            int n = Integer.parseInt(console.nextLine());
            if (n >= 1 && n <= 100) {
                System.out.println(+ n);
                lenght = 0;
            }
        }
    }
}
