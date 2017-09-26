import java.util.Scanner;

public class invalidNumber {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int numb = Integer.parseInt(console.nextLine());
        if (numb==0||(numb>=100&&numb<=200)){
            System.out.print("");
        }else System.out.println("invalid");
    }
}
