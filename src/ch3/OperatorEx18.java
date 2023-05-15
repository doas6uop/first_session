package ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        // Math.round() : 매개변수로 받은 값을 소수점 첫째자리에서 반올림 후, 그 결과를 정수로 돌려주는 메서드.
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // Math.round(3141.592)의 결과는 3142이다.
        System.out.println(shortPi);
    }
}
