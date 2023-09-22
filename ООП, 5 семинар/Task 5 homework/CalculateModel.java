
public class CalculateModel {

    public double NumbersSum(double number1, double number2) {
        
        return number1 + number2;
    }

    public double NumbersDifference(double number1, double number2) {

        return number1 - number2;
    }

    public double NumbersMultiplication(double number1, double number2) {
    
        return number1 * number2;
    }

    public double NumbersDivision(double number1, double number2) {

        if (number2 == 0)
        {
            throw new ArithmeticException("Деление на 0 разрешено только при получении бесконечности. Не наш вариант!");
        } 
        else 
        {
            return number1 / number2;
        }

    }
}