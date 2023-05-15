package ch3;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

                                        // Ex8과 비슷한 예제이다. 특정한 숫자를 저장해주었으나 동일한 문제가 발생한다.
        System.out.println("a = " + a); // 오버플로우 발생!!
        System.out.println("a = " + b); // L을 추가해줘서 다행
    }
}
