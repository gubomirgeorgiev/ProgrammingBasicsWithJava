import java.util.Scanner;

public class pointInTheFigure {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        double h = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double basisX = h*3;
        double basisY = h;
        double towerX = 2*h;
        double towerY=4*h;
        if (0<=x&&basisX>=x&&0<=y&&basisY>=y){
            if (0<x&&basisX>x&&0<y&&basisY>y){
                System.out.println("inside");
            } else if (0==x||(basisX==x&&(x<=h||x>=h*2))||0==y||(basisY==y&&(x<=h||x>=h*2))){
                System.out.println("border");
            }else System.out.println("inside");
        } else if (h<=x&&(towerX)>=x&&h<=y&&(towerY)>=y){
            if (h<x&&(towerX)>x&&h<y&&(towerY)>y){
                System.out.println("inside");
            }
            else if (h==x||(towerX)==x||h==y||(towerY)==y){
                System.out.println("border");
            }
        }else System.out.println("outside");
    }
}
