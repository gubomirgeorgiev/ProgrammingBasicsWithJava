import java.util.Scanner;

public class Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i=1; i<=n;i+=3) {
            System.out.println(i);
        }
    }
}
