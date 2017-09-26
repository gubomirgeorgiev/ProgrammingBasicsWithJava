import java.util.Scanner;

public class tiles {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        double n = Double.parseDouble( console.nextLine() );
        double w = Double.parseDouble( console.nextLine() );
        double l = Double.parseDouble( console.nextLine() );
        double m = Double.parseDouble( console.nextLine() );
        double o = Double.parseDouble( console.nextLine() );
        double time = 0.2;
        double areaPlaza = Math.pow( n,2 );
        double areaBench = m*o;
        double areaTile = w*l;
        double numberOfTiles = (areaPlaza-areaBench)/areaTile;
        System.out.printf("%.2f%n",numberOfTiles);
        System.out.printf("%.2f",(time*numberOfTiles));
    }
}
