import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int prim=0;
        int prim2=0;
        if (num>2&&num%2==0||num%3==0&&num!=3){
            System.out.println("Not Prime");
        }else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0 && ( i == 1 || i == num ) && num >= 2) {
                    prim = 1;
                } else if (( num % i == 0 && i < num ) || num < 2) {
                    prim2 = 1;
                }
            }
            if (prim > prim2) {
                System.out.println("Prime");
            } else System.out.println("Not Prime");
        }
    }
}
