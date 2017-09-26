import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int basis=Integer.MIN_VALUE;
        int counter=0;
        for (int i =0;i<n;i++){
            int num = Integer.parseInt(console.nextLine());
            counter+=num;
            if (num>basis){
                basis=num;
            }
        }
        if (basis==counter-basis){
            System.out.println("Yes");
            System.out.println("Sum = "+basis);
        } else {
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(basis-(counter-basis)));
        }
    }
}
