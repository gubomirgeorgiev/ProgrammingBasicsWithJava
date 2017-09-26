import java.util.Map;
import java.util.Scanner;

public class number0To100ToText {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        String first="";
        String second="";
        if (num >= 0 &&num<=100){
        if (num % 10 == 1&&num!=11) {
            second = "one";
        }
            if (num % 10 == 2&&num!=12) {
            second = "two";
        }
                if (num % 10 == 3&&num!=13) {
                second = "three";
        }
                    if (num % 10 == 4&&num!=14) {
                    second = "four";
        }
                        if (num % 10 == 5&&num!=15) {
                         second = "five";
        }
                            if (num % 10 == 6&&num!=16) {
                            second = "six";
        }
                                if (num % 10 == 7&&num!=17) {
                                second = "seven";
        }
                                    if (num % 10 == 8&&num!=18) {
                                    second = "eight";
        }
                                        if (num % 10 == 9&&num!=19) {
                                        second = "nine";
        }
        if (Math.ceil(num/10)==2&&num!=20){
            first="twenty";
        }
            if (Math.ceil(num/10)==3&&num!=30){
            first="thirty";
        }
                if (Math.ceil(num/10)==4&&num!=40){
                first="forty";
        }
                    if (Math.ceil(num/10)==5&&num!=50){
                    first="fifty";
        }
                        if (Math.ceil(num/10)==6&&num!=60){
                        first="sixty";
        }
                            if (Math.ceil(num/10)==7&&num!=70){
                            first="seventy";
        }
                                if (Math.ceil(num/10)==8&&num!=80){
                                first="eighty";
        }
                                    if (Math.ceil(num/10)==9&&num!=90){
                                    first="ninety";
        }
            if (Math.ceil(num/10)<1){
                System.out.format(second);
            } else if(Math.ceil(num/10)>1&&num%10!=0) System.out.printf("%s %s",first,second);
        if (num==0) {
            System.out.print("zero");
        }
            if (num==10){
            System.out.print("ten");
        }
                if (num==11){
                System.out.print("eleven");
        }
                    if (num==12){
                    System.out.print("twelve");
        }
                        if (num==13){
                        System.out.print("thirteen");
        }
                            if (num==14){
                            System.out.print("fourteen");
        }
                                if (num==15){
                                System.out.print("fifteen");
        }
                                    if (num==16){
                                    System.out.print("sixteen");
        }
                                        if (num==17){
                                        System.out.print("seventeen");
        }
                                            if (num==18){
                                            System.out.print("eighteen");
        }
                                                if (num==19){
                                                System.out.print("nineteen");
        }
                                                    if (num==20){
                                                    System.out.print("twenty");
        }
                                                        if (num==30){
                                                        System.out.print("thirty");
        }
                                                            if (num==40){
                                                            System.out.print("forty");
        }
                                                                if (num==50){
                                                                System.out.print("fifty");
        }
                                                                    if (num==60){
                                                                    System.out.print("sixty");
        }
                                                                        if (num==70){
                                                                        System.out.print("seventy");
        }
                                                                            if (num==80){
                                                                            System.out.print("eighty");
        }
                                                                                if (num==90){
                                                                                System.out.print("ninety");
        }
                                                                                    if (num==100){
                                                                                    System.out.print("one hundred");
        }
                            }else System.out.print("invalid number");

    }
}
