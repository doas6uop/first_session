package ch3;

public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b); // 정수형끼리 나눌 경우 소수점 이하는 버려진다.
        System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b); // 올바른 연산결과를 얻기 위해서는 피연산자 중 어느 한 쪽을 실수형으로 형변환해야한다.(이 경우 다른 한 쪽은 변환값을 따라 자동형변환함)

        // System.out.printf("%d / %d = %d%n", a, 0, a / 0); // 피연산자가 정수형인경우 0으로 나눌 수 없다(실행시 오류 발생)
    }
}
