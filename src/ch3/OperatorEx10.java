package ch3;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 곱한 후 나눔. 도중에 오버플로우 발생
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // 나눈 후 곱해서 다행
        // 같은 의미의 연산식이라도 연산순서에 따라 다른 결과를 얻을 수 있다.
    }
}
