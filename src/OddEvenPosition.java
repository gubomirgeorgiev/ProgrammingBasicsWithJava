import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.###########");
        double n = Double.parseDouble(console.nextLine());
        double oddSum=0;
        double oddMin=99999;
        double oddMax=-99999;
        double evenSum=0;
        double evenMin=99999;
        double evenMax=-99999;
        for (int i=1;i<=n;i++){
            Double number = Double.parseDouble(console.nextLine());
            if (i%2!=0){
            oddSum+=number;
                if (number<oddMin){
                oddMin=number;
            }
            if (number>oddMax){
                oddMax=number;
            }

            }
            else if (i%2==0){
                evenSum+=number;
                if (number<evenMin){
                    evenMin=number;
                }
                if (number>evenMax){
                    evenMax=number;
                }
            }
        }
        if (oddSum==(int)oddSum) {
            System.out.printf("OddSum = %d,%n", (int)oddSum);
        }else System.out.println("OddSum = "+ format.format(oddSum));
        if (oddMin==-99999||n==0){
            System.out.println("oddMin =No,");
        }else {
            if (oddMin==(int)oddMin){
                System.out.printf("oddMin = %d,%n",(int)oddMin);
            }else System.out.println("oddMin = "+ format.format(oddMin));
        }
        if (oddMax==99999||n==0){
            System.out.println("oddMax =No,");
        }else {
            if (oddMax==(int)oddMax){
                System.out.printf("oddMax = %d,%n",(int)oddMax);
            }else System.out.println("oddMax = "+ format.format(oddMax));
        }
        //if (evenSum==0){
           // System.out.println("EvenSum =No,");
        //}else
        System.out.println("EvenSum = "+ format.format(evenSum));
        if (evenMin==99999||n==0){
            System.out.println("EvenMin =No,");
        }else {
            if (evenMin==(int) evenMin){
                System.out.printf("EvenMin = %d,%n",(int)evenMin);
            }else System.out.println("EvenMin = "+ format.format(evenMin));
        }
        if (evenMax==-99999||n==0){
            System.out.printf("EvenMax =No");
        }else {
            if (evenMax==(int)evenMax){
                System.out.printf("EvenMax = %d,%n",(int)evenMax);
            }else System.out.print("EvenMax = "+ format.format(evenMax));
        }
    }
}
