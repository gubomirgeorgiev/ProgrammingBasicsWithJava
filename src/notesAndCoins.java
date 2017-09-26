import java.util.Scanner;

public class notesAndCoins {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int oneLevs = Integer.parseInt(console.nextLine());
        int oneLevsFor=oneLevs;
        int twoLevs = Integer.parseInt(console.nextLine());
        int twoLevsFor= twoLevs;
        int fiveLevs = Integer.parseInt(console.nextLine());
        int fiveLevsFor = fiveLevs;
        int sum = Integer.parseInt(console.nextLine());
        for (int one=0;one<=oneLevsFor;one++){
            for (int two = 0;two<=twoLevsFor*2; two+=2){
                for (int five =0;five<=fiveLevsFor*5;five+=5){
                    if(((five+two+one)==sum)){
                        System.out.printf("%d * %d lv. + %d * %d lv. + %d * %d lv. = %d lv.%n",one/1,1,two/2,2,five/5,5,sum);
                    }
                }
            }
        }
    }
}
