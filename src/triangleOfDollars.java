import java.util.Scanner;

public class triangleOfDollars {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
