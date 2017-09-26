import java.util.Scanner;

public class oddEvenSum {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sumEven=0;
        int sumOdd = 0;
        for (int i = 1;i<=num;i++){
            int entry = Integer.parseInt(console.nextLine());
                if (i%2==0){
                    sumEven+=entry;
                }else {sumOdd+=entry;}

        }
        if (sumEven==sumOdd){
            System.out.println("Yes");System.out.println("Sum = "+ sumEven);
        }else {
            int difference = Math.abs(sumEven-sumOdd);
            System.out.println("No");System.out.println("Diff = "+ difference);
        }
    }
}
