import java.util.Scanner;
public class vowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                int aCount = 1;
                sum += aCount;
            }
            if (text.charAt(i) == 'e') {
                int eCount = 2;
                sum += eCount;
            }
            if (text.charAt(i) == 'i') {
                int iCount = 3;
                sum += iCount;
            }
            if (text.charAt(i) == 'o') {
                int oCount = 4;
                sum += oCount;
            }
            if (text.charAt(i) == 'u') {
                int uCount = 5;
                sum += uCount;
            }
        }
        System.out.println(sum);
    }
}
