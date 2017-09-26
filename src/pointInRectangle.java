import java.util.Scanner;

public class pointInRectangle {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double cordX = x2-x1;
        double cordY = y2-y1;
        if (x1<=x&&x2>=x&&y1<=y&&y2>=y){
            System.out.println("inside");
        }else System.out.println("outside");
    }
}
