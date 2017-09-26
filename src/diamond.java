import java.util.Scanner;

public class diamond {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count,count2,count3,count4,count5,count6,count7,count8;
        for (int j=0;j<((3*n)+2);j++){
            if(j==0) {
                for (int i = 0; i < ( n * 5 ); i++) {
                    if (i < n || i > ( ( n * 5 ) - n - 1 )) {
                        System.out.print(".");
                    } else if (( i > n || i < ( ( n * 5 ) - n ) )) System.out.print("*");
                }
            }
            if (j==n) {
                    for (int i=0;i<(n*5);i++) {
                        System.out.print("*");
                    }
                }
            if (j>0&&j<n){
                for (int i=1;i<=(n*5);i++) {
                    count=j;
                    count2=n;
                    count3=(n*4);
                    count4=j;
                    count2-=count-1;
                    count3+=count4;
                    if(i==count2||i==count3){
                        System.out.print("*");
                    }else {System.out.print(".");}

                }
                }
            if (j>n&&j<(3*n)+1){
                for (int i=0;i<(n*5);i++) {
                    count5=j;
                    count6=n;
                    count5-=count6;
                    count7=(n*6);
                    count8=j;
                    count7-=count8+1;
                    if(i==count5||i==count7){
                        System.out.print("*");
                    }else {System.out.print(".");}
                }
            }
            if (j==(3*n)+1){
                for (int i=0;i<(n*5);i++){
                 if ((i>=(2*n)+1)&&(i<(3*n)-1)){
                     System.out.print("*");
                 }else {System.out.print(".");}
                }
            }
            System.out.println();
                }
                }
}
