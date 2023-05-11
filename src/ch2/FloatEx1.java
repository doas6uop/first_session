package ch2;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.1234567890123456780d;

        System.out.printf("     12345678901234%n");
        System.out.printf("f  : %f%n", f); // 소수점 이하 6번째 자리까지 출력
        System.out.printf("f  : %24.20f%n", f); // %24.20f 는 전체 24자리 중 20자리는 소수점 이하의 수를 출력하라는 뜻이다.
        System.out.printf("f2 : %24.20f%n", f2); //
        System.out.printf("d  : %24.20f%n", d);
    }
}
