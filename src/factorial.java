import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int count1;
        int count2=1;
        for (int i=1;i<=a;i++){
          count1=i;
          count2*=count1;
        }System.out.println(count2);
    }
}
