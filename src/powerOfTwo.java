import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int pow = 2;
        System.out.println(1);
        for (int i =0;i<n;i++){
            System.out.println(pow);
            pow*=2;
        }
    }
}
