public class numbersFrom1to1000WhchEndsWith7 {
    public static void main (String[] args) {
        for (int i=1;i<=1000;i++)  {
            if((i==7)||(i>10&&i<1000&&i%10==7)){
                System.out.println(i);
            }
        }
    }
}