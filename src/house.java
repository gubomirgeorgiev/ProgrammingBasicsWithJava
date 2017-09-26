import java.util.Scanner;

public class house {
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
        int countOdd=(int)Math.floor((n/2));
        int countEven=(int)Math.floor((n/2)-1);
        int starsOdd = 1;
        int starsEven=2;
        for (int i = 0; i < n; i++) {
            if (n<3){
                if(i==0) {
                    System.out.print(repeatStr("*", n));
                    System.out.println();
                    System.out.print(repeatStr("|", n));
                    System.out.println();
                }
            }
                else{
               if(n%2!=0&&i<=(int)Math.floor((n/2))){
                   System.out.print(repeatStr("-", countOdd));
                   System.out.print(repeatStr("*", starsOdd));
                   System.out.print(repeatStr("-", countOdd));
                   starsOdd+=2;
                   countOdd--;
                   System.out.println();
               }
                if(n%2==0&&i<=((int)Math.floor((n/2)-1))){
                    System.out.print(repeatStr("-", countEven));
                    System.out.print(repeatStr("*", starsEven));
                    System.out.print(repeatStr("-", countEven));
                    starsEven+=2;
                    countEven--;
                    System.out.println();
                }
                if (n%2!=0&&i>(int)Math.floor((n/2))){
                    System.out.print("|");
                    System.out.print(repeatStr("*", n-2));
                    System.out.print("|");
                    System.out.println();
                }
                if(n%2==0&&i>((int)Math.floor((n/2)-1))){
                    System.out.print("|");
                    System.out.print(repeatStr("*", n-2));
                    System.out.print("|");
                    System.out.println();
                }
            }
        }
    }
}
