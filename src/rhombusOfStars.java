import java.util.Scanner;

public class rhombusOfStars {
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
        int count=n;
        int stars=2;
        int count2=0;
        int stars2=n-1;
        if (n==1){
            System.out.println("*");
        }else
        for (int i = 0; i < (2*n); i++) {
                if (i==0){
                    count-=1;
                    System.out.print(repeatStr(" ", count));
                    System.out.print("*");
                    System.out.println();
                }

                if (i>0&&i<n){
                    count--;
                    System.out.print(repeatStr(" ", count));
                    System.out.print(repeatStr("* ", stars++));
                    System.out.println();
                }
                if (i<(2*n)-1&&i>n){
                    count2++;
                    System.out.print(repeatStr(" ", count2));
                    System.out.print(repeatStr("* ", stars2--));
                    System.out.println();
                }
                if (i==(2*n)-1){
                    count-=1;
                    System.out.print(repeatStr(" ", n-1));
                    System.out.print("*");
                    System.out.println();
                }
        }

    }
}
