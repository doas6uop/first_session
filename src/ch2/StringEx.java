package ch2;

public class StringEx {
    public static void main(String[] args) {
        // 문자열은 덧셈연산자(+)를 이용하여 결합할 수 있다.
        // 이때 피연산자가 다른 타입이더라도 문자열로 변경되는데, 피연산자의 순서에 따라 결과가 달라진 수 있다.

        String name = "Ja" + "va";
        String str = name + 8.0 ;

        System.out.println("1. name: " + name);
        System.out.println("2. str: " + str);
        System.out.print("3. 7 + \" \": ");
        System.out.println(7 + " ");
        System.out.print("4. \" \" + 7: ");
        System.out.println("" + 7);
        System.out.print("5. 7 + \"\": ");
        System.out.println(7 + "");
        System.out.print("6. \"\" + 7: ");
        System.out.println("" + 7);
        System.out.print("7. \"\" + \"\": ");
        System.out.println("" + "");
        System.out.print("8. 7 + 7 + \"\": ");
        System.out.println(7 + 7 + "");
        System.out.print("9. \"\" + 7 + 7: ");
        System.out.println("" + 7 + 7);
    }
}
