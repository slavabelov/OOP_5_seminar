
import java.util.Scanner;

public class CalculateView {

    public double FirstInputByUser() {

        double number1 = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести первый операнд: ");
        if (Scanner.hasNextDouble()) {
            number1 = Scanner.nextDouble();
        }
        else
        {
            throw new ArithmeticException("Это не число!");
        }
        return number1;
    }

    public double SecondInputByUser() {
        double number2 = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести второй операнд: ");
        if (Scanner.hasNextDouble()) {
            number2 = Scanner.nextDouble();
            Scanner.close();
        }
        else 
        {
            throw new ArithmeticException("Это не число!");
        }
        return number2;
    }

    public String OperatorInputByUser() {

        String OP = "";
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести оператор: ");
        if(Scanner.hasNextLine()) {
            OP = Scanner.nextLine();
        }
        return OP;
    }
    public void ResultPrinting(double printResult) {
        System.out.println("Результат представлен в виде: " + printResult);
    }
    public void ErrorPrinting(String errorMessage) {
        System.out.println("Ошибка представлена в виде: " + errorMessage);
    }

}