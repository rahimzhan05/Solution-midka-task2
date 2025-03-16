import coffee.Coffee;
import factory.CappuccinoFactory;
import factory.EspressoFactory;
import factory.LatteFactory;
import order.Order;
import order.OrderService;
import toppings.Caramel;
import toppings.Chocolate;
import toppings.Milk;

import java.util.Scanner;

// Главная программа
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService service = new OrderService();

        while (true) {
            System.out.println("\n☕ Выберите кофе:");
            System.out.println("1️⃣ Эспрессо");
            System.out.println("2️⃣ Капучино");
            System.out.println("3️⃣ Латте");
            System.out.println("4️⃣ История заказов");
            System.out.println("5️⃣ Выход");
            System.out.print("👉 Ваш выбор: ");

            int choice = scanner.nextInt();
            Coffee coffee = null;

            switch (choice) {
                case 1: coffee = new EspressoFactory().make(); break;
                case 2: coffee = new CappuccinoFactory().make(); break;
                case 3: coffee = new LatteFactory().make(); break;
                case 4: service.showHistory(); continue;
                case 5: System.out.println("🚪 Программа завершена."); scanner.close(); return;
                default: System.out.println("❌ Ошибка! Повторите выбор."); continue;
            }

            System.out.println("\n✨ Добавки:");
            System.out.println("1️⃣ Молоко");
            System.out.println("2️⃣ Карамель");
            System.out.println("3️⃣ Шоколад");
            System.out.println("4️⃣ Готово");

            while (true) {
                System.out.print("👉 Выберите добавку (или 4 для завершения): ");
                int addChoice = scanner.nextInt();
                if (addChoice == 4) break;
                switch (addChoice) {
                    case 1: coffee = new Milk(coffee); break;
                    case 2: coffee = new Caramel(coffee); break;
                    case 3: coffee = new Chocolate(coffee); break;
                    default: System.out.println("❌ Ошибка! Попробуйте снова.");
                }
            }

            Order order = service.processOrder(coffee);
            System.out.println("✅ Заказ оформлен: " + order);
        }
    }
}
