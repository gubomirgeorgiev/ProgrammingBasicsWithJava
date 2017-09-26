import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num1=0;
        int num2=1;
        int num3=0;
        if (n<2){
            System.out.println(1);
        }else{
            for (int i=0;i<n;i++){
                num3=num1+num2;
                num1=num2;
                num2=num3;
            }
            System.out.println(num3);
        }
    }
}
