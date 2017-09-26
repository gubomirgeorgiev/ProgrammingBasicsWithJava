import java.util.Scanner;

public class stupidPasswordGenerator {
    static char findLetter1(int count) {
        char letter;
        switch (count) {
            case 1:
                letter = 'a';
                break;
            case 2:
                letter = 'b';
                break;
            case 3:
                letter = 'c';
                break;
            case 4:
                letter = 'd';
                break;
            case 5:
                letter = 'e';
                break;
            case 6:
                letter = 'f';
                break;
            case 7:
                letter = 'g';
                break;
            case 8:
                letter = 'h';
                break;
            case 9:
                letter = 'i';
                break;
            default:
                letter = 'a';
        }
        return letter;
    }

    static char findLetter2(int count) {
        char letter;
        switch (count) {
            case 1:
                letter = 'a';
                break;
            case 2:
                letter = 'b';
                break;
            case 3:
                letter = 'c';
                break;
            case 4:
                letter = 'd';
                break;
            case 5:
                letter = 'e';
                break;
            case 6:
                letter = 'f';
                break;
            case 7:
                letter = 'g';
                break;
            case 8:
                letter = 'h';
                break;
            case 9:
                letter = 'i';
                break;
            default:
                letter = 'a';
        }
        return letter;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        for (int e = 1; e <= 9; e++) {
                            if (( e > a && e > b && e <= n ) && d <= l & c <= l && b < n && a < n) {
                                System.out.print(a);
                                System.out.print(b);
                                System.out.print(findLetter1(c));
                                System.out.print(findLetter2(d));
                                System.out.print(e);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}

