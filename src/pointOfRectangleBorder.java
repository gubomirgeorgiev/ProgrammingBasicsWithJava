import java.util.Scanner;

public class pointOfRectangleBorder {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        if (x1<=x&&x2>=x&&y1<=y&&y2>=y){
            if(x1<x&&x2>x&&y1<y&&y2>y){
            System.out.println("Inside / Outside");}
            else System.out.println("border");
        }
        else System.out.println("Inside / Outside");
    }
}
