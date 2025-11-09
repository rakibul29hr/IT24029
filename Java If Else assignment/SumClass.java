package ict.twentyOne.ClassName;

public class SumClass {
    public static double sumSeries() {
        double sum = 0.0;
        double num = 1.0;

        do {
            sum += num;
            num -= 0.1;
        } while (num >= 0.01);

        return Math.round(sum * 100.0) / 100.0;
    }
}
