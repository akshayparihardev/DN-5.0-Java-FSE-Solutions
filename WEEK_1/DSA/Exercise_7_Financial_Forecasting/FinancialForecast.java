package WEEK_1.DSA.Exercise_7_Financial_Forecasting;

public class FinancialForecast {

    public double futureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}