package ch3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a != 0 && ++b != 0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b); // 좌측의 변수가 || 및 && 의 조건을 충족하여 우측 조건이 동작하지 않는다. 따라서 b는 값이 변하지 않는다.
        System.out.printf("a == 0 && ++b != 0 = %b%n", a != 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }
}
