import java.util.Scanner;

public class diamond6ThExercise {
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
        int dashOdd = (int)Math.floor((n/2));
        int dashOdd2=1;
        int dashEven=(n/2)-1;
        int dashEven2=2;
        if (n < 3) {
            System.out.print(repeatStr("*", n));
        }
            else if (n%2!=0){
        for (int i = 0; i < n; i++) {
            if (i==0||i==n-1){
                System.out.print(repeatStr("-", (int)Math.floor((n/2))));
                System.out.print(repeatStr("*", 1));
                System.out.print(repeatStr("-", (int)Math.floor((n/2))));
                System.out.println();
            }
            else if (i<=(int)Math.floor((n/2))){
                dashOdd--;
                System.out.print(repeatStr("-", dashOdd));
                System.out.print("*");
                System.out.print(repeatStr("-", dashOdd2));
                System.out.print("*");
                System.out.print(repeatStr("-", dashOdd));
                dashOdd2+=2;
                System.out.println();
            }
            else if(i>(int)Math.floor((n/2))){
                dashOdd++;
                dashOdd2-=2;
                System.out.print(repeatStr("-", dashOdd));
                System.out.print("*");
                System.out.print(repeatStr("-", dashOdd2-2));
                System.out.print("*");
                System.out.print(repeatStr("-", dashOdd));
                System.out.println();
            }
        }
    } else if (n%2==0){
            for (int i = 0; i < n-1; i++){
                if (i==0||i==n-2){
                    System.out.print(repeatStr("-", (int)Math.floor((n/2))-1));
                    System.out.print(repeatStr("**", 1));
                    System.out.print(repeatStr("-", (int)Math.floor((n/2))-1));
                    System.out.println();
                }
                else if (i<n/2){
                    dashEven--;
                    System.out.print(repeatStr("-", dashEven));
                    System.out.print("*");
                    System.out.print(repeatStr("-", dashEven2));
                    System.out.print("*");
                    System.out.print(repeatStr("-", dashEven));
                    dashEven2+=2;
                    System.out.println();
                }
                else if(i>=n/2){
                    dashEven++;
                    dashEven2-=2;
                    System.out.print(repeatStr("-", dashEven));
                    System.out.print("*");
                    System.out.print(repeatStr("-", dashEven2-2));
                    System.out.print("*");
                    System.out.print(repeatStr("-", dashEven));
                    System.out.println();
                }
            }
        }
    }
}
