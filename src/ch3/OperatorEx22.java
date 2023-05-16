package ch3;

public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10 == 10.f \t %b%n", 10 == 10.0f);
        System.out.printf("0.1 == 0.1f \t %b%n", '0' == 0);
        System.out.printf("f ==%19.17f%n", f); // 실수형은 근사값으로 저장되므로 오차가 발생할 수 있다.
        System.out.printf("d ==%19.17f%n", d); // double 타입은 float보다 정밀도가 더 높다.
        System.out.printf("d2 ==%19.17f%n", d2); // float에서 double로 형변환한다고 오차가 적어지진 않는다.
        System.out.printf("d==f %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n", d2==f);
        // float과 double 타입을 비교하기 위해서는 double타입을 float으로 형변환 후 비교하거나, 앞 몇 자리만 잘라서 비교한다.
        System.out.printf("(float)d==f %b%n", (float) d==f);
    }
}
