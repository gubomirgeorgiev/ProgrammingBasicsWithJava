import java.util.Scanner;

public class squareArea {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        System.out.println((int)Math.pow(a, 2));
    }
}
