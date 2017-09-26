import java.util.Scanner;

public class CGD {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int num = -1;
        if (a > b) {
            for (int i = 1; i <=a; i++) {
                if (a % i == 0 &&b % i==0&&i > num) {
                        num = i;
                }
            }
        } else if (a<b){
            for (int i = 1; i <=b; i++) {
                if (a % i == 0 &&b % i==0&&i > num ) {
                        num = i;
                }
            }
        }
        else {
            num=a;
        }System.out.println(num);
    }
}

