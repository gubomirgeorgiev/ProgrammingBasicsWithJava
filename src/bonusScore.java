import java.util.Scanner;

public class bonusScore {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int lastDigit = num % 10;
        boolean even = num % 2 == 0;
        int bonus;
        double bonusD;
        int evenNumer = 1;
        int endsFive = 2;
        int lessHundred = 5;
        double biggerHundred = num*0.2;
        double biggerThousand = num*0.1;
        if (num <= 100) {
            if (even == true) {
                if (lastDigit == 5) {
                    bonus = lessHundred + evenNumer + endsFive;
                    System.out.println(bonus);
                    System.out.print(num + bonus);
                } else if (lastDigit != 5) {
                    bonus = lessHundred + evenNumer;
                    System.out.println(bonus);
                    System.out.print(num + bonus);
                }
            } else if (even == false) {
                if (lastDigit == 5) {
                    bonus = lessHundred + endsFive;
                    System.out.println(bonus);
                    System.out.print(num + bonus);
                }
                   else if (lastDigit != 5) {
                        bonus = lessHundred;
                        System.out.println(bonus);
                        System.out.print(num + bonus);
                    }
                }
            }

    if (num>100&&num<=1000){
        if (even == true) {
            if (lastDigit == 5) {
                bonusD=biggerHundred+evenNumer+endsFive;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }else if (lastDigit != 5) {
                bonusD=biggerHundred+evenNumer;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }
        }else if (even == false) {
            if (lastDigit == 5) {
                bonusD=biggerHundred+endsFive;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }else if (lastDigit != 5) {
                bonusD = biggerHundred;
                System.out.printf("%.1f%n", bonusD);
                System.out.printf("%.1f", num + bonusD);
            }
        }
    }
    if (num>1000){
        if (even == true) {
            if (lastDigit == 5) {
                bonusD=biggerThousand+evenNumer+endsFive;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }else if (lastDigit != 5) {
                bonusD=biggerThousand+evenNumer;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }
        }else if (even == false){
            if (lastDigit == 5) {
                bonusD=biggerThousand+endsFive;
                System.out.printf("%.1f%n",bonusD);
                System.out.printf("%.1f",num+bonusD);
            }else if (lastDigit != 5) {
                bonusD = biggerThousand;
                System.out.printf("%.1f%n", bonusD);
                System.out.printf("%.1f", num + bonusD);
            }
        }
    }
    }
}
