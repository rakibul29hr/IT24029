package ict.twentyOne.ClassName;

public class MainC {
    static SumClass sumClass = new SumClass();
    static DivisorMultipleClass divMulClass = new DivisorMultipleClass();
    static NumberConversionClass numConvClass = new NumberConversionClass();
    static CustomPrintClass customPrint = new CustomPrintClass();
    public static void main(String[] args) {
        double total = SumClass.sumSeries();
        CustomPrintClass.pr("Sum of series (1 + 0.9 + ... + 0.1) = " + total);
        int a = 24, b = 36;
        CustomPrintClass.pr("GCD of " + a + " and " + b + " = " + DivisorMultipleClass.gcd(a, b));
        CustomPrintClass.pr("LCM of " + a + " and " + b + " = " + DivisorMultipleClass.lcm(a, b));
        int number = 45;
        CustomPrintClass.pr("Decimal " + number + " in Binary: " + NumberConversionClass.decimalToBinary(number));
        CustomPrintClass.pr("Decimal " + number + " in Hex: " + NumberConversionClass.decimalToHex(number));
        CustomPrintClass.pr("Decimal " + number + " in Octal: " + NumberConversionClass.decimalToOctal(number));
        CustomPrintClass.pr("Binary 101101 to Decimal: " + NumberConversionClass.binaryToDecimal("101101"));
        CustomPrintClass.pr("Octal 55 to Decimal: " + NumberConversionClass.octalToDecimal("55"));
        CustomPrintClass.pr("Hex 2D to Decimal: " + NumberConversionClass.hexToDecimal("2D"));
    }
}
