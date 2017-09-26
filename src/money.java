import java.util.Scanner;

public class money {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        int bitCoin =(Integer.parseInt( console.nextLine() ))*1168;
        double yuan = (Double.parseDouble( console.nextLine() ))*0.15;
        double commision = Double.parseDouble( console.nextLine() );
        double eur = 1.95;
        double doolarsInLevs = yuan*1.76;
        double moneyInEuro =((float)bitCoin+doolarsInLevs)/eur;
        double commisionSummary = moneyInEuro * ( commision / 100 );
        System.out.printf("%.2f",moneyInEuro-commisionSummary);

    }
}
