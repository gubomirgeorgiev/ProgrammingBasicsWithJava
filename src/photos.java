import java.util.Scanner;

public class photos {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int photos = Integer.parseInt(console.nextLine());
        String photoType = console.nextLine();
        String orderType = console.nextLine();
        String order="online";
        double price =0;
        switch (photoType){
            case "9X13":
                if (photos>=50){
                    if (orderType.equals(order)) {
                        price = (( photos * 0.16 ) - ( ( photos * 0.16 ) * 0.05 ))*0.98;
                    }else price = ( photos * 0.16 ) - ( ( photos * 0.16 ) * 0.05 );
                }else {
                    if (orderType.equals(order)) {
                        price = ( photos * 0.16 )*0.98;
                    }else price = ( photos * 0.16 );
                }
                break;
            case "10X15":
                if (photos>=80){
                    if (orderType.equals("online")) {
                        price = (( photos * 0.16 ) - ( ( photos * 0.16 ) * 0.03 ))*0.98;
                    }else price = ( photos * 0.16 ) - ( ( photos * 0.16 ) * 0.03 );
                }else {
                    if (orderType.equals(order)) {
                        price = ( photos * 0.16 )*0.98;
                    }else price = ( photos * 0.16 );
                }
                break;
            case "13X18":
                if (photos>=50&&photos<=100){
                    if (orderType.equals("online")) {
                        price = (( photos * 0.38 ) - ( ( photos * 0.38 ) * 0.03 ))*0.98;
                    }else price = ( photos * 0.38 ) - ( ( photos * 0.38 ) * 0.03 );
                }
                else if (photos>100){
                    if (orderType.equals("online")) {
                        price = (( photos * 0.38 ) - ( ( photos * 0.38 ) * 0.05 ))*0.98;
                    }else price = ( photos * 0.38 ) - ( ( photos * 0.38 ) * 0.05 );
                }
                else {
                    if (orderType.equals(order)) {
                        price = ( photos * 0.38 )*0.98;
                    }else price = ( photos * 0.38 );
                }
                break;
            case "20X30":
                if (photos>=10&&photos<=50){
                    if (orderType.equals("online")) {
                        price = (( photos * 2.9 ) - ( ( photos * 2.9 ) * 0.07 ))*0.98;
                    }else price = ( photos * 2.9 ) - ( ( photos * 2.9 ) * 0.07 );
                }
                else if (photos>50){
                    if (orderType.equals("online")) {
                        price = (( photos * 2.9 ) - ( ( photos * 2.9 ) * 0.09 ))*0.98;
                    }else price = ( photos * 2.9 ) - ( ( photos * 2.9 ) * 0.09 );
                }
                else {
                    if (orderType.equals(order)) {
                        price = ( photos * 2.9 )*0.98;
                    }else price = ( photos * 2.9 );
                }
                break;
        }
        System.out.printf("%.2fBGN", price);
    }
}
