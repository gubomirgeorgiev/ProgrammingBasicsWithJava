import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count=0;
        int num;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (count<=n) {
                    count = i + j + 1;
                    System.out.print(count+" ");
                }else{
                   // count = i + j + 1;
                    num=(2*n)-count;
                    System.out.print(num+" ");

                }
            }
            System.out.println();
        }
    }
}
