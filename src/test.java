import java.util.Scanner;

/**
 * Created by lyubomirgeorgiev on 02/08/2017.
 */
public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<2;j++) {
                int entry = Integer.parseInt(console.nextLine());
                counter+=entry;
            }
            }
        System.out.println(counter);
    }
}
