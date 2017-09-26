import java.util.Scanner;

public class timePlus15minutes {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = (Integer.parseInt(console.nextLine()))*60;
        int minute = Integer.parseInt(console.nextLine())+15;
        int hoursOutput;
        int minutesOutput;
        if (hour+minute<=1439){
            hoursOutput=Math.abs((hour+minute)/60);
            minutesOutput=(hour+minute)%60;
            System.out.printf("%d:%02d",hoursOutput,minutesOutput);
        }
        else {
            minutesOutput=(hour+minute)%60;
            System.out.printf("0:%02d",minutesOutput);
        }
    }
}

