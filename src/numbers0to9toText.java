import java.util.Scanner;

public class numbers0to9toText {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        if (num<10){
            if (num==0) System.out.println("zero");
            if (num==1) System.out.println("one");
            if (num==2) System.out.println("two");
            if (num==3) System.out.println("three");
            if (num==4) System.out.println("four");
            if (num==5) System.out.println("five");
            if (num==6) System.out.println("six");
            if (num==7) System.out.println("seven");
            if (num==8) System.out.println("eight");
            if (num==9) System.out.println("nine");
        } else System.out.println("number too big");
    }
}
