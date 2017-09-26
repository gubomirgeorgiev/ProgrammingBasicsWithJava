import java.util.Scanner;

public class leftAndRightSum {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sumLeft=0;
        int sumRight=0;
        for (int i=0;i<num;i++){
            int entryLeft=Integer.parseInt(console.nextLine());
            sumLeft+=entryLeft;
        }
        for (int i=0;i<num;i++){
            int entryLeft=Integer.parseInt(console.nextLine());
            sumRight+=entryLeft;
        }
        if (sumLeft==sumRight){
            System.out.println("Yes, sum = "+sumLeft);
        }else {
            int difference = Math.abs(sumLeft - sumRight);
            System.out.println("No, diff = "+difference);
        }
    }
}
