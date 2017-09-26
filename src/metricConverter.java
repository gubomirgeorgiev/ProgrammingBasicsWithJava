import java.util.Scanner;

public class metricConverter {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        String metric1 = console.nextLine();
        String metric2 = console.nextLine();
        double metric1Int=1;
        double metric2Int=1;
        int mm = 1000;
        int cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double converteValue=1;
        if (metric1.equals("cm")) {
        metric1Int=cm;
        }
        else if (metric1.equals("mm")){
            metric1Int=mm;
        }
        else if (metric1.equals("mi")){
            metric1Int=mi;
        }
        else if (metric1.equals("in")){
            metric1Int=in;
        }
        else if (metric1.equals("km")){
            metric1Int=km;
        }
        else if (metric1.equals("ft")){
            metric1Int=ft;
        }
        else if (metric1.equals("yd")){
            metric1Int=yd;
        }
        else if (metric1.equals("m")){
            metric1Int=1;
        }
        if (metric2.equals("mm")){
            metric2Int=mm;
        }
        else if (metric2.equals("cm")){
            metric2Int=cm;
        }
        else if (metric2.equals("mi")){
            metric2Int=mi;
        }
        else if (metric2.equals("in")){
            metric2Int=in;
        }
        else if (metric2.equals("km")){
            metric2Int=km;
        }
        else if (metric2.equals("ft")){
            metric2Int=ft;
        }
        else if (metric2.equals("yd")){
            metric2Int=yd;
        }
        else if (metric2.equals("m")){
            metric2Int=1;
        }
        converteValue=(num/metric1Int)*metric2Int;
        System.out.printf("%f %s",converteValue,metric2);
    }
}
