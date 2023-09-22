public class CalculatePresenter {

    private CalculateModel model;
    private CalculateView view;

    public CalculatePresenter(CalculateModel model, CalculateView view) {
        this.model = calcmodel;
        this.view = calcview;
    }
    public double FirstValueInput(){
        return view.FirstInputByUser();
    }
    public double SecondValueInput(){
        return view.SecondInputByUser();
    }
    public String OperatorValueInput() {
        return view.OperatorInputByUser();
    }
    public void Calculation() {
        double ResultValue;
        try {
            switch (OperatorValueInput()){
                case "+":
                    ResultValue = model.NumbersSum(FirstValueInput(), SecondValueInput());
                    break;
                case "-":
                    ResultValue = model.NumbersDifference(FirstValueInput(), SecondValueInput());
                    break;
                case "*":
                    ResultValue = model.NumbersMultiplication(FirstValueInput(), SecondValueInput());
                    break;
                case "/":
                    ResultValue = model.NumbersDivision(FirstValueInput(), SecondValueInput());
                    break;
                default:
                    view.ErrorPrinting("Введите корректный оператор! ");
                    return;
            }
            view.ResultPrinting(ResultValue);
        } catch (ArithmeticException error) {
            view.ErrorPrinting(error.getMessage());
        }
    }
}