import java.util.Scanner;

public class enterEvenNuber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int stopper=999;
        int number;
        for (int i=0; i<stopper;i++) {
            String line = console.nextLine();
            try {
                number= Integer.parseInt(line);
                if (number%2==0){
                    System.out.println(number);
                    stopper=0;
                }
            }catch (NumberFormatException e){
            }
        }
    }
}
