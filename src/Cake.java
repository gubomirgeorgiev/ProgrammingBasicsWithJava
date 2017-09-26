import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int width = Integer.parseInt(console.nextLine());
        int lenght = Integer.parseInt(console.nextLine());
        int cakeArea=width*lenght;
        int integer;
        int counter=999;
        for (int i =0;i<counter;i++) {
            if (cakeArea < 0) {
                counter = 0;
            } else {
                try {
                    String piece = console.nextLine();
                    integer = Integer.parseInt(piece);
                    cakeArea -= integer;

                } catch (NumberFormatException e) {
                    counter = 0;
                }
            }
        }if (cakeArea>0){
            System.out.printf("%d pieces are left.", cakeArea);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
        }
    }
}
