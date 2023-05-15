package ch3;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
        System.out.println(shortPi); // int 간의 나눗셈을 하더라도 0.5를 더해주면 반올림된다.
    }
}
