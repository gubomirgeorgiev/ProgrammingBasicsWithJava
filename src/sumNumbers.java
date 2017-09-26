import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sum=0;
        for (int i=0;i<num;i++){
            int count=Integer.parseInt(console.nextLine());
            sum+=count;
        }
        System.out.println(sum);
    }
}
