package Admin;
import java.util.Scanner;
public class Admin {
    public int[] changeprice(int[] price) {
        Scanner sca = new Scanner(System.in);
        String qw = "-1";
        do {
            String choice, cho = "-1";
            System.out.println("\n1 for jeans\n2 for t-shirt\n3 for shirt\n0 for exit");
            System.out.print("Enter your choice : ");
            qw = sca.next();
            switch (qw) {
                case "1":
                    do {
                        System.out.println("PRICE OF SIZE 32 IS : " + price[0]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size 32 : ");
                            price[0] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE 34 IS : " + price[1]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size 34 : ");
                            price[1] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE 36 IS : " + price[2]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size 36 : ");
                            price[2] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "2":
                    do {
                        System.out.println("PRICE OF SIZE M IS : " + price[3]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size M : ");
                            price[3] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE L IS : " + price[4]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size L : ");
                            price[4] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE XL IS : " + price[5]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size XL : ");
                            price[5] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "3":
                    do {
                        System.out.println("PRICE OF SIZE M IS : " + price[6]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size M : ");
                            price[6] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE L IS : " + price[7]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size L : ");
                            price[7] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("PRICE OF SIZE XL IS : " + price[8]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of price for size XL : ");
                            price[8] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (qw.equals("-1"));
        return price;
    }

    public int[] changestock(int[] stock) {
        Scanner sca = new Scanner(System.in);
        String qw = "-1";
        do {
            String choice, cho = "-1";
            System.out.println("\n1 for jeans\n2 for t-shirt\n3 for shirt\n0 for exit");
            System.out.print("Enter your choice : ");
            qw = sca.next();
            switch (qw) {
                case "1":
                    do {
                        System.out.println("STOCK OF SIZE 32 IS : " + stock[0]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size 32 : ");
                            stock[0] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE 34 IS : " + stock[1]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size 34 : ");
                            stock[1] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE 36 IS : " + stock[2]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size 34 : ");
                            stock[2] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "2":
                    do {
                        System.out.println("STOCK OF SIZE M IS : " + stock[3]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size M : ");
                            stock[3] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE L IS : " + stock[4]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size L : ");
                            stock[4] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE XL IS : " + stock[5]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size XL : ");
                            stock[5] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "3":
                    do {
                        System.out.println("STOCK OF SIZE M IS : " + stock[6]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size M : ");
                            stock[6] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE L IS : " + stock[7]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size L : ");
                            stock[7] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    do {
                        System.out.println("STOCK OF SIZE XL IS : " + stock[8]);
                        System.out.print("Do you want to change ? \n 1 YES \n 2 NO : ");
                        choice = sca.next();
                        if (choice.equals("1")) {
                            System.out.print("Enter new value of stock for size XL : ");
                            stock[8] = sca.nextInt();
                            cho = "1";
                        } else if (choice.equals("2")) {
                            cho = "1";
                        } else {
                            cho = "-1";
                            System.out.println("Invalid choice");
                        }
                    } while (cho.equals("-1"));
                    cho = "-1";
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (qw.equals("-1"));
        return stock;
    }
}