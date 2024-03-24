package MyBusiness.Shop;

import MyBusiness.Menu.Menu;

import java.util.Scanner;

public class Shop {
    public static void shop() {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.printMenu1();
            String menu1 = scanner.next();
            switch (menu1) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    return;
                default:
                    System.out.println("Введено некорректное значениею");
                    System.out.println("Попробуйте еще раз.");
                    break;


            }
        }
    }
}
