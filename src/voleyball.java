import java.util.Scanner;

public class voleyball {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String yearType = console.nextLine();
        double p = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double sum,finalNumber, countLeap;
            switch (yearType){
                case "leap":
                  sum = ((((48-h)*3)/4)+((p*2)/3))+h;
                  countLeap = sum*0.15;
                  finalNumber=Math.floor(countLeap+sum);
                    System.out.print((int)finalNumber);
                    break;
                case "normal":
                    sum = ((((48-h)*3)/4)+((p*2)/3))+h;
                    System.out.print((int)Math.floor(sum));
                    break;
            }
    }
}
