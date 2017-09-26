import java.util.Scanner;

public class snowflake {
        static String repeatStr(String strToRepeat, int count) {
            String text = "";
            for (int i = 0; i < count; i++) {
                text = text + strToRepeat;
            }
            return text;
        }

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int n = Integer.parseInt(console.nextLine());
            int dots1=n;
            int dots2=n;
            int dots3=n-1;
            int dots4=n-1;
            int dots5=1;
            int dots6=1;
            for (int i=0; i<(2*n)+1;i++){
                if (i<n) {
                    System.out.print(repeatStr(".", i));
                    System.out.print("*");
                    if (dots1 < 2) {
                        System.out.print("**");
                    } else {
                        System.out.print(repeatStr(".", dots1--));
                        System.out.print("*");
                    }
                    if (dots2 < 2) {
                        System.out.print("**");
                    } else {
                        System.out.print(repeatStr(".", dots2--));
                        System.out.print("*");
                    }
                    System.out.print(repeatStr(".", i));
                }
                if (i==n){
                    System.out.print(repeatStr("*", (2*n)+3));
                }
                if (i>n){
                    System.out.print(repeatStr(".", dots3--));
                    System.out.print("*");
                    if (dots5<2) {
                        System.out.print("**");
                        dots5++;
                    }else {
                        System.out.print(repeatStr(".", dots5++));
                        System.out.print("*");}
                    if (dots6<2) {
                        System.out.print("**");
                        dots6++;
                    }else {
                        System.out.print(repeatStr(".", dots6++));
                        System.out.print("*");}
                    System.out.print(repeatStr(".", dots4--));
                }System.out.println();
            }

        }
}

