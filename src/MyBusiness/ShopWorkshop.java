package MyBusiness;

import MyBusiness.Menu.Menu;
import MyBusiness.Shop.Shop;
import MyBusiness.Warehouse.Warehouse;
import java.util.Scanner;

public class ShopWorkshop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Warehouse warehouse = new Warehouse();
        Shop shop = new Shop();

        System.out.println("\t Добро пожаловать в ShopWorkshop");

        while (true) {
            Menu.printMenu();
            String mainMenu = scanner.next();
            switch (mainMenu) {
                case "1": //Магазин
                    Shop.shop();
                    break;
                case "2": //Склад
                    Warehouse.warehouse();
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
