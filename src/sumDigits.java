import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sum=0;
        do{
            sum = sum+(num%10);
            num=num/10;
        }
        while (num>0);
        System.out.println(sum);
    }
}
