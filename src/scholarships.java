import java.util.Scanner;

public class scholarships {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double income = Double.parseDouble(console.nextLine());
        double averageGrade = Double.parseDouble(console.nextLine());
        double minimumWage = Double.parseDouble(console.nextLine());
        double scholarshipSocial;
        double scholarshipExcel;
        if (income<=minimumWage&&averageGrade>=4.5){
            scholarshipSocial=minimumWage*0.35;
            scholarshipExcel=averageGrade*25;
            if (averageGrade>5.5){
                if (scholarshipExcel>=scholarshipSocial) {
                    System.out.printf("You get a scholarship for excellent results %d BGN", (int)   scholarshipExcel);
                }else {
                    System.out.printf("You get a Social scholarship %d BGN", (int)scholarshipSocial);
                }
            }else{
                System.out.printf("You get a Social scholarship %d BGN", (int)scholarshipSocial);
            }
        }else System.out.print("You cannot get a scholarship!");
    }
}
