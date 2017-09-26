import java.util.Scanner;

public class sequence2Kplus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count=0;
        for (int i=1;i<=n;i=count+1){
                System.out.println(count+1);
                count=i*2;
            }
        }
    }

