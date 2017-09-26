import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String town = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        double coffee,water,beer,sweets,peanuts;
        String coffeeS = "coffee";
        String waterS = "water";
        String beerS = "beer";
        String sweetsS = "sweets";
        String peanutsS = "peanuts";
        if (town.equals("Sofia")){
        coffee=0.50;
        water=0.80;
        beer=1.20;
        sweets=1.45;
        peanuts=1.60;
        if (product.equals(coffeeS)){
            System.out.println(quantity*coffee);
        }
        else if (product.equals(waterS)) {
            System.out.println(quantity * water);
        }
        else if (product.equals(beerS)) {
            System.out.println(quantity * beer);
        }
        else if (product.equals(sweetsS)) {
            System.out.println(quantity * sweets);
        }
        else if(product.equals(peanutsS)) {
            System.out.println(quantity * peanuts);
        }
                }
                if (town.equals("Plovdiv")){
                    coffee=0.40;
                    water=0.70;
                    beer=1.15;
                    sweets=1.30;
                    peanuts=1.50;
                    if (product.equals(coffeeS)){
                        System.out.println(quantity*coffee);
                    }
                    else if (product.equals(waterS)) {
                        System.out.println(quantity * water);
                    }
                    else if (product.equals(beerS)) {
                        System.out.println(quantity * beer);
                    }
                    else if (product.equals(sweetsS)) {
                        System.out.println(quantity * sweets);
                    }
                    else if(product.equals(peanutsS)) {
                        System.out.println(quantity * peanuts);
                    }
                }
                    if (town.equals("Varna")){
                        coffee=0.45;
                        water=0.70;
                        beer=1.10;
                        sweets=1.35;
                        peanuts=1.55;
                        if (product.equals(coffeeS)){
                            System.out.println(quantity*coffee);
                        }
                        else if (product.equals(waterS)) {
                            System.out.println(quantity * water);
                        }
                        else if (product.equals(beerS)) {
                            System.out.println(quantity * beer);
                        }
                        else if (product.equals(sweetsS)) {
                            System.out.println(quantity * sweets);
                        }
                        else if(product.equals(peanutsS)) {
                            System.out.println(quantity * peanuts);
                        }
                    }
    }
}
