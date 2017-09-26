import java.util.Scanner;

public class equalWords {public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    String word1 = console.nextLine();
    String word2 = console.nextLine();
    if (word1.toLowerCase().contains(word2.toLowerCase())){
        System.out.println("yes");
    }
    else System.out.println("no");
}
}
