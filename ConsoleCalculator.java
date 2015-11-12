/**
 * Created by Григорий on 12.11.2015.
 */
package ConsoleCalculator;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input) {
            case "сложить":
                System.out.println("Введите первое число:");
                String inputSum1 = scanner.nextLine();
                int sum = Integer.parseInt(inputSum1);
                System.out.println("Введите второе число");
                String inputSum2 = scanner.nextLine();
                sum = sum + Integer.parseInt(inputSum2);
                System.out.println("Сумма равна: " + sum);
                break;

            case "умножить":
                System.out.println("Введите первое число:");
                String inputMult1 = scanner.nextLine();
                int mult = Integer.parseInt(inputMult1);
                System.out.println("Введите второе число");
                String inputMult2 = scanner.nextLine();
                mult = mult * Integer.parseInt(inputMult2);
                System.out.println("Произведение равно: " + mult);
                break;

            case "делить":
                System.out.println("Введите делимое:");
                String inputDiv1 = scanner.nextLine();
                double div = Integer.parseInt(inputDiv1);
                System.out.println("Введите делитель");
                String inputDiv2 = scanner.nextLine();
                div = div / Integer.parseInt(inputDiv2);
                System.out.println("Частное равно: " + div);
                break;

            case "вычесть":
                System.out.println("Введите уменьшаемое число:");
                String inputSub1 = scanner.nextLine();
                int sub = Integer.parseInt(inputSub1);
                System.out.println("Введите вычитаемое число");
                String inputSub2 = scanner.nextLine();
                sub = sub - Integer.parseInt(inputSub2);
                System.out.println("Разность равна: " + sub);
                break;

            default:
                System.out.println("Доступные команды: сложить, вычесть, умножить, делить");
                break;
        }
    }
}