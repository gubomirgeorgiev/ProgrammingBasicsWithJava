import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count=0;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i ;++j){
                count++;
                if (count<=n) {
                    System.out.print(count);
                }else j=n+1;

            }
            System.out.println();
        }
    }
}
