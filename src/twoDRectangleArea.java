import java.util.Scanner;

public class twoDRectangleArea {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double area = (x1-x2)*(y1-y2);
        double perimeter = (Math.abs(x1-x2)+Math.abs(y1-y2))*2 ;
        System.out.printf("area = %f%nperimeter = %f",Math.abs(area),Math.abs(perimeter));
    }
}
