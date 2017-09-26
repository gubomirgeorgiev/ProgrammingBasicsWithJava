import java.util.Scanner;

public class vegetableMarket {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        double  priceVegyKg = Double.parseDouble( console.nextLine() );
        double  priceFruitKg = Double.parseDouble( console.nextLine() );
        int kgVegy = Integer.parseInt( console.nextLine() );
        int kgFruit = Integer.parseInt( console.nextLine() );
        double eur = 1.94;
        double result = ((priceFruitKg*kgFruit)+(priceVegyKg*kgVegy))/eur;
        System.out.printf("%.2f", result);
    }
}
