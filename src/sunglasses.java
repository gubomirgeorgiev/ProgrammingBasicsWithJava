import java.util.Scanner;

public class sunglasses {
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
        int count = n;
        int stars = 0;
        for (int i = 0; i <n; i++) {
            if (i==0||i==n-1){
                System.out.print(repeatStr("*", 2*count));
                System.out.print(repeatStr(" ", count));
                System.out.print(repeatStr("*", 2*count));
                System.out.println();
            }
            if (i>0&&i<n-1){
                System.out.print("*");
                System.out.print(repeatStr("/", (2*count)-2));
                System.out.print("*");
                if(((n%2==0)&&i==Math.round(n/2)-1)||(n%2!=0&&i==Math.round(n/2))){
                System.out.print(repeatStr("|", count));
                }else{
                    System.out.print(repeatStr(" ", count));
                }
                System.out.print("*");
                System.out.print(repeatStr("/", (2*count)-2));
                System.out.print("*");
                System.out.println();
            }

        }
    }
}
