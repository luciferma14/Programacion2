public class Basico31 {
    public static void main(String[] args) {
        
        int a = 8;
        int b = 3;
        int c = (-5);

        int result1 = a + b + c;
        int result2 = 2 * b + 3 * (a - c);
        int result3 = a / b;
        int result4 = a % b;
        int result5 = a / c;
        int result6 = a * (b / c);
        int result7 = a * c % b;
        int result8 = (a - 3 * b) % (c + 2 * a) / (a - c);
        int result9 = a - b - c * 2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    }
}