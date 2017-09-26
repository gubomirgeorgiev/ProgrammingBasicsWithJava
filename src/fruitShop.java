import java.util.Scanner;

public class fruitShop {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String day = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        double  banana,apple,orange,grapefruit,kiwi,pineapple,grapes;
        if ((day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||
                day.equals("Saturday")||day.equals("Sunday"))&&(fruit.equals("banana")||fruit.equals("apple")||fruit.equals("orange")||
                fruit.equals("grapefruit")||fruit.equals("kiwi")||fruit.equals("pineapple")||fruit.equals("grapes"))) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                banana = 2.50;
                apple = 1.20;
                orange = 0.85;
                grapefruit = 1.45;
                kiwi = 2.70;
                pineapple = 5.50;
                grapes = 3.85;
                if (fruit.equals("banana")) {
                    System.out.println(quantity * banana);
                } else if (fruit.equals("apple")) {
                    System.out.println(quantity * apple);
                } else if (fruit.equals("orange")) {
                    System.out.println(quantity * orange);
                } else if (fruit.equals("grapefruit")) {
                    System.out.println(quantity * grapefruit);
                } else if (fruit.equals("kiwi")) {
                    System.out.println(quantity * kiwi);
                } else if (fruit.equals("pineapple")) {
                    System.out.println(quantity * pineapple);
                } else if (fruit.equals("grapes")) {
                    System.out.println(quantity * grapes);
                }
            } else if (day.equals("Saturday") || day.equals("Sunday")) {
                banana = 2.70;
                apple = 1.25;
                orange = 0.90;
                grapefruit = 1.60;
                kiwi = 3.00;
                pineapple = 5.60;
                grapes = 4.20;
                if (fruit.equals("banana")) {
                    System.out.println(quantity * banana);
                } else if (fruit.equals("apple")) {
                    System.out.println(quantity * apple);
                } else if (fruit.equals("orange")) {
                    System.out.println(quantity * orange);
                } else if (fruit.equals("grapefruit")) {
                    System.out.println(quantity * grapefruit);
                } else if (fruit.equals("kiwi")) {
                    System.out.println(quantity * kiwi);
                } else if (fruit.equals("pineapple")) {
                    System.out.println(quantity * pineapple);
                } else if (fruit.equals("grapes")) {
                    System.out.println(quantity * grapes);
                }
            }
        }else System.out.println("error");
    }
}
