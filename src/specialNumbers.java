import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i =1; i<=9;i++){
            for (int j =1; j<=9; j++){
                for (int k =1; k<=9; k++){
                    for (int l =1; l<=9; l++){
                        if ((n%l)==0&&(n%k)==0&&(n%j)==0&&(n%i)==0){
                            System.out.printf("%d%d%d%d ", i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}
