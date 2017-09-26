import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        double amount = Double.parseDouble(console.nextLine());
        String entryCurrency = console.nextLine();
        String outCurrency = console.nextLine();
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        double exchange=0;
        if(Arrays.asList(entryCurrency).contains("BGN")&&Arrays.asList(outCurrency).contains("EUR")){
            exchange = amount/eur;
                    }
        if(Arrays.asList(entryCurrency).contains("BGN")&&Arrays.asList(outCurrency).contains("GBP")){
            exchange = amount/gbp;
                    }
        if(Arrays.asList(entryCurrency).contains("BGN")&&Arrays.asList(outCurrency).contains("USD")){
            exchange = amount/usd;
                    }
        if(Arrays.asList(entryCurrency).contains("USD")&&Arrays.asList(outCurrency).contains("BGN")){
            exchange = amount*usd;
                    }
        if(Arrays.asList(entryCurrency).contains("EUR")&&Arrays.asList(outCurrency).contains("BGN")){
            exchange = amount*eur;
                    }
        if(Arrays.asList(entryCurrency).contains("GBP")&&Arrays.asList(outCurrency).contains("BGN")){
            exchange = amount*gbp;
                    }
        if(Arrays.asList(entryCurrency).contains("EUR")&&Arrays.asList(outCurrency).contains("GBP")){
            exchange = (amount*eur)/gbp;
                    }
        if(Arrays.asList(entryCurrency).contains("EUR")&&Arrays.asList(outCurrency).contains("USD")){
            exchange = (amount*eur)/usd;
                    }
        if(Arrays.asList(entryCurrency).contains("GBP")&&Arrays.asList(outCurrency).contains("USD")){
            exchange = (amount*gbp)/usd;
                    }
        if(Arrays.asList(entryCurrency).contains("USD")&&Arrays.asList(outCurrency).contains("GBP")){
            exchange = (amount*usd)/gbp;
                    }
        if(Arrays.asList(entryCurrency).contains("USD")&&Arrays.asList(outCurrency).contains("EUR")){
            exchange = (amount*usd)/eur;
                    }
        System.out.printf("%.2f",exchange);
    }
}
