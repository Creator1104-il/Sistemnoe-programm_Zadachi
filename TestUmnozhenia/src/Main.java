import java.util.Scanner;
import static java.lang.Math.exp;
import static java.lang.Math.log;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner in = new Scanner(System.in);
        a = 5; //in.nextInt();
        b = 3; //in.nextInt();
        System.out.println(method1(a, b));
        System.out.println(method2(a, b));
        System.out.println(method3(a, b));
        System.out.println(method4(a, b));
        System.out.println(method5(a, b));

    }

    static int method1(double a, double b){
        return  ((int)(a / (1.0 / b)));
    }
    static int method2(double a, double b){
        int result = 0;
        if (b >0){
            for(int i = 0; i<b; i++){
                result += (int) a;
            }} else {
            for(int i = 0;i > b;i--){
                result -= (int) a;
            }}
        return result;
    }
    static int method3(double a, double b){
        return ( (int)Math.round ( exp(log(a) + log(b))));
    }
    static int method4(double x, double y){

        long a = (long) x;
        long b = (long) y;
        long result = 0;

        // Определяем знак результата
        int sign = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1; // эквивалент a * 2
            b >>= 1; // эквивалент b / 2
        }
        return (int) (result * sign);
    }
    static int method5(double a, double b) {
        String s = "Z".repeat((int)Math.abs(a));
        String t = s.repeat((int)Math.abs(b));
        int result = t.length();
        return (((a < 0) ^ (b < 0)) ? -result : result);
    }

}