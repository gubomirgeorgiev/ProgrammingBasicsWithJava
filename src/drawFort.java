import java.util.Scanner;

public class drawFort {
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            /**
             N<5
             */
            if (n < 5) {
                if (i == 0) {
                    System.out.print("/");
                    System.out.print(repeatStr("^", n / 2));
                    System.out.print("\\");
                    System.out.print("/");
                    System.out.print(repeatStr("^", n / 2));
                    System.out.print("\\");
                    System.out.println();
                } else if (i == n - 1) {
                    System.out.print("\\");
                    System.out.print(repeatStr("_", n / 2));
                    System.out.print("/");
                    System.out.print("\\");
                    System.out.print(repeatStr("_", n / 2));
                    System.out.print("/");
                    System.out.println();
                } else {
                    System.out.print("|");
                    System.out.print(repeatStr(" ", ( 2 * n ) - 2));
                    System.out.print("|");
                    System.out.println();
                }
            } else {
                /**
                 N>5 & EVEN numbers
                 */
                if (n % 2 == 0) {
                    if (( i == 0 )) {
                        System.out.print("/");
                        System.out.print(repeatStr("^", (n / 2)));
                        System.out.print("\\");
                        if (( n / 2 ) % 2 == 0) {
                            System.out.print(repeatStr("_", n / 2));
                        } else {
                            System.out.print(repeatStr("_", ( n / 2 ) - 1));
                        }
                        System.out.print("/");
                        System.out.print(repeatStr("^", (n / 2)));
                        System.out.print("\\");
                        System.out.println();
                    } else if (i == n - 1) {
                        System.out.print("\\");
                        System.out.print(repeatStr("_", (n / 2)));
                        System.out.print("/");
                        if (( n / 2 ) % 2 == 0) {
                            System.out.print(repeatStr(" ", n / 2));
                        } else {
                            System.out.print(repeatStr(" ", ( n / 2 ) - 1));
                        }
                        System.out.print("\\");
                        System.out.print(repeatStr("_", (n / 2)));
                        System.out.print("/");
                        System.out.println();
                    } else if (i == n - 2) {
                        System.out.print("|");
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        if (( n / 2 ) % 2 == 0) {
                            System.out.print(repeatStr("_", n / 2));
                        } else {
                            System.out.print(repeatStr("_", ( n / 2 ) - 1));
                        }
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        System.out.print("|");
                        System.out.println();
                    } else {
                        System.out.print("|");
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        if (( n / 2 ) % 2 == 0) {
                            System.out.print(repeatStr(" ", n / 2));
                        } else {
                            System.out.print(repeatStr(" ", ( n / 2 ) - 1));
                        }
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        System.out.print("|");
                        System.out.println();
                    }

                }
                /**
                 N>5 & ODD numbers
                 */
                else if (n % 2 != 0) {
                    if (( i == 0 )) {
                        System.out.print("/");
                        System.out.print(repeatStr("^", (n / 2)));
                        System.out.print("\\");
                            System.out.print(repeatStr("_", (int)Math.ceil((n / 2)-1)));

                        System.out.print("/");
                        System.out.print(repeatStr("^", (n / 2)));
                        System.out.print("\\");
                        System.out.println();
                    }
                    else if (i == n - 2) {
                        System.out.print("|");
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                            System.out.print(repeatStr("_", (int)Math.ceil((n / 2)-1)));
                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        System.out.print("|");
                        System.out.println();
                    }
                    else if (i == n - 1) {
                        System.out.print("\\");
                        System.out.print(repeatStr("_", (n / 2)));
                        System.out.print("/");

                            System.out.print(repeatStr(" ", (int)Math.ceil((n / 2)-1)));

                        System.out.print("\\");
                        System.out.print(repeatStr("_", (n / 2)));
                        System.out.print("/");
                        System.out.println();
                    }
                    else {
                        System.out.print("|");
                        System.out.print(repeatStr(" ", (n / 2) + 1));

                            System.out.print(repeatStr(" ", (n / 2)-1));

                        System.out.print(repeatStr(" ", (n / 2) + 1));
                        System.out.print("|");
                        System.out.println();
                    }
                }
            }
        }
    }
}
