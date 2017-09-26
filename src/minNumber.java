import java.util.Scanner;

public class minNumber {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int max=999999;
        for (int i =0;i<num;i++){
            int entry=Integer.parseInt(console.nextLine());
            if (entry<=max){
                max=entry;
            }
        }
        System.out.println(max);
    }
}
