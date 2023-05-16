package ch3;

public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;
        System.out.printf(" p =%d \t%s%n", p, toBinaryString(p));
        System.out.printf(" ~p =%d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf(" ~p+1 =%d \t%s%n", ~p+1, toBinaryString(~p+1)); // 양의 정수일 경우 동일한 음의 값을 얻으려면 ~p+1을 계산해야한다.
        System.out.printf(" ~~p =%d \t%s%n", ~~p, toBinaryString(~~p)); // 원래의 값이 된다. 단, 타입은 int로 변환한다.
        System.out.println();
        System.out.printf(" n =%d%n", n);
        System.out.printf(" ~(n-1) =%d%n", ~(n-1)); // 음에 대한 양의정수를 얻으려면 ~(n-1)을 계산한다.
    }

    // 10진 정수를 2진수로 변환하는 메서드
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}
