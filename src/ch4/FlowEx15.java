package ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("=================================================");

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
        }

        // 2*i      : 짝수
        // 2*i-1    : 홀수
        // i*i      : 제곱
        // 11-i     : 역순
        // i%3      : 순환 (특정 범위의 값들이 순환한다)
        // i/3      : 반복 (같은 값이 연속적으로 반복된다)
    }
}
