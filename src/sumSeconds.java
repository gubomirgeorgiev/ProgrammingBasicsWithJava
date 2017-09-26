import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int third = Integer.parseInt(console.nextLine());
        int sum =first+second+third;
        long min = Math.abs(sum/60);
        long sec = sum%60;
        System.out.format("%d:%02d",min,sec);
}
}
