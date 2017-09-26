import java.util.Scanner;

public class areaOfFigures {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String figureType = console.nextLine();
        double area=0;
        if (figureType.contains("rectangle")||figureType.contains("triangle")){
            double num1 = Double.parseDouble(console.nextLine());
            double num2 = Double.parseDouble(console.nextLine());
            if (figureType.contains("rectangle")){
                area = num1*num2;
                System.out.println(area);
            }
            else if (figureType.contains("triangle")){
                area =(num1/2)*num2;
                System.out.println(area);
            }
        }
        else{
            double num1 = Double.parseDouble(console.nextLine());
            if (figureType.contains("square")) {
                area = Math.pow(num1, 2);
                System.out.println(area);
            }
            else if (figureType.contains("circle")){
                area = Math.PI*Math.pow(num1,2);
                System.out.println(area);
            }
        }
    }
}
