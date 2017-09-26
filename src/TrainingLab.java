import java.util.Scanner;

public class TrainingLab {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        double h = (Double.parseDouble( console.nextLine() ))*100;
        double w = ((Double.parseDouble( console.nextLine() ))*100)-100;
        double newH = Math.floor(h/120);
        double newW = Math.floor(w/70);
        int rows = (int)newH;
        int descPerRows = (int)newW;
        int numberOfSeats = (rows*descPerRows)-3;
        System.out.println(numberOfSeats);
    }
}
