package Zadanie7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Value leftNum, rightNum;
        Operation operation;

       try( Scanner scanner = new Scanner(System.in)) {
           System.out.println("Введите первое число:");
           leftNum = new Value(scanner.nextDouble());

           System.out.println("Выберите операцию \"+\"; \"-\"; \"*\"; \"/\"");
           operation = Operation.getBySymbol(scanner.next().charAt(0));


           System.out.println("Введите второе число:");
           rightNum = new Value(scanner.nextDouble());

           Calculator calc = new Calculator(leftNum, rightNum, operation);

           System.out.println("Результат вычислений: " + calc.getResult());
       }
       catch (RuntimeException e)
       {
          System.out.println("Во время работы калькулятора произошла ошибка. " + e.getLocalizedMessage());
       }
    }
}
