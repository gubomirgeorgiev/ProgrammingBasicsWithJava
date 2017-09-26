import java.util.Scanner;

public class excellentOrNotResult {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        double score = Double.parseDouble(console.nextLine());
        if (score>=5.5){
            System.out.println("Excellent!");
        } else System.out.println("Not excellent.");
    }
}
