package ict.twentyOne.ClassName;
public class DivisorMultipleClass {
    public static int gcd(int a, int b) {
        do {
            int temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
