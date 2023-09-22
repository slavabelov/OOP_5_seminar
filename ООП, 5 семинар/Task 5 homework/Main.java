
public class Main {

    public static void main(String[] args) {

        CalculateModel model = new CalculateModel();
        CalculateView view = new CalculateView();
        CalcalatePresenter CalcalatePresenter = new CalcalatePresenter(model, view);

        CalcalatePresenter.Calculation();
    }
}