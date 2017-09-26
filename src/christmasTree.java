import java.util.Scanner;

public class christmasTree {
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
        int stars=0;
        for (int i=0; i<=n;i++){
            if(i==0){
                System.out.print(repeatStr(" ", count+1));
                System.out.print("|");
                System.out.println();
            }
            if (i>0){
                count--;
                stars++;
                System.out.print(repeatStr(" ", count));
                System.out.print(repeatStr("*", stars));
                System.out.print(" | ");
                System.out.print(repeatStr("*", stars));
                System.out.println();
            }
        }
    }
}
