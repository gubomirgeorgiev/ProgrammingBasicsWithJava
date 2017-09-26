import java.util.Scanner;

public class passwordGuess {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String enter = console.nextLine();
        String password = "s3cr3t!P@ssw0rd";
        String welcome = "Welcome";
        String wrong = "Wrong password!";
                if(enter.contains(password)){
                    System.out.print(welcome);
                }
                else System.out.println(wrong);
    }
}
