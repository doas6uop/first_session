package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1,000,000
        int b = 2_000_000; // 2,000,000

        long c = a * b;

        System.out.println("1. c: " + c); // int * int 이므로 계산 결과는 int이다. 따라서 long형 변수에 저장되더라도 오버플로우가 발생한다.

        c = (long) a * b;

        System.out.println("2. c: " + c); // 따라서 명시적 형변환이 필요하다.

    }
}
