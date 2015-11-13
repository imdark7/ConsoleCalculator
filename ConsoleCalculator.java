/**
 * Created by Григорий on 12.11.2015.
 */
package ConsoleCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input) {
            case "сложить":
                System.out.println("Введите первое число:");
                double inputSum1 = scanner.nextDouble();
                System.out.println("Введите второе число");
                double inputSum2 = scanner.nextDouble();
                double sum = inputSum1 + inputSum2;
                System.out.println("Сумма равна: " + sum);
                break;

            case "умножить":
                System.out.println("Введите первое число:");
                double inputMult1 = scanner.nextDouble();
                System.out.println("Введите второе число");
                double inputMult2 = scanner.nextDouble();
                double mult = inputMult1 * inputMult2;
                System.out.println("Произведение равно: " + mult);
                break;

            case "делить":
                System.out.println("Введите делимое:");
                double inputDiv1 = scanner.nextDouble();
                System.out.println("Введите делитель");
                double inputDiv2 = scanner.nextDouble();
                double div = inputDiv1 / inputDiv2;
                System.out.println("Частное равно: " + div);
                break;

            case "вычесть":
                System.out.println("Введите уменьшаемое число:");
                double inputSub1 = scanner.nextDouble();
                System.out.println("Введите вычитаемое число");
                double inputSub2 = scanner.nextDouble();
                double sub = inputSub1 - inputSub2;
                System.out.println("Разность равна: " + sub);
                break;

            default:
                System.out.println("Доступные команды: сложить, вычесть, умножить, делить");
                break;

            /*

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        switch(input) {
            case "сложить":
                System.out.println("Введите первое число:");
                String inputSum1 = reader.readLine();
                int sum = Integer.parseInt(inputSum1);
                System.out.println("Введите второе число");
                String inputSum2 = reader.readLine();
                sum = sum + Integer.parseInt(inputSum2);
                System.out.println("Сумма равна: " + sum);
                break;

            case "умножить":
                System.out.println("Введите первое число:");
                String inputMult1 = reader.readLine();
                int mult = Integer.parseInt(inputMult1);
                System.out.println("Введите второе число");
                String inputMult2 = reader.readLine();
                mult = mult * Integer.parseInt(inputMult2);
                System.out.println("Произведение равно: " + mult);
                break;

            case "делить":
                System.out.println("Введите делимое:");
                String inputDiv1 = reader.readLine();
                double div = Integer.parseInt(inputDiv1);
                System.out.println("Введите делитель");
                String inputDiv2 = reader.readLine();
                div = div / Integer.parseInt(inputDiv2);
                System.out.println("Частное равно: " + div);
                break;

            case "вычесть":
                System.out.println("Введите уменьшаемое число:");
                String inputSub1 = reader.readLine();
                int sub = Integer.parseInt(inputSub1);
                System.out.println("Введите вычитаемое число");
                String inputSub2 = reader.readLine();
                sub = sub - Integer.parseInt(inputSub2);
                System.out.println("Разность равна: " + sub);
                break;

            default:
                System.out.println("Доступные команды: сложить, вычесть, умножить, делить");
                break;
                 */
        }
    }
}