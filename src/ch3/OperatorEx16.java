package ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f;
        System.out.println(shortPi); // ※ int 형 간의 나눗셈을 수행하면 float, double이 아닌 int이다.
    }
}
