import java.util.Scanner;

public class equalPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (i==0) {
                    int num = Integer.parseInt(console.nextLine());
                 counter1+=num;
                }
                if (i>0){
                    int num = Integer.parseInt(console.nextLine());
                    counter2+=num;
                }
            } if (counter1>counter2){
                if(i>2&&counter3>=counter2){
                counter3=counter2;}else counter3=counter2;
                if(i>2&&counter4<=counter1){
                    counter4=counter1;
                }else counter4=counter1;
                counter2=0;
            }else {
                if (i>2&&counter3>=counter1){counter3=counter1;}else counter3=counter1; if (i>2&&counter4<=counter2){counter4=counter2;} else counter4=counter2;
                 ;counter2=0;}

        }
        if(counter3==counter4||counter1==counter2){
            System.out.println("Yes, value="+counter3);
        }else if (n==1) {

                System.out.println("Yes, value="+counter1);

        }
        else {
            System.out.println("No, maxdiff="+Math.abs(counter4-counter3));
        }
    }
}