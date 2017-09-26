import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String projectionType = console.nextLine();
        int r = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        switch (projectionType){
            case "Premiere":
                System.out.printf("%.2f leva",c*r*12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva",c*r*7.5);
                break;
            case "Discount":
                System.out.printf("%.2f leva",c*r*5.00);
                break;
                default:
                    break;
        }
    }
}
