package ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
        System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
        // 내용이 동일하더라도 '=='로 비교하면 false를 얻는다. 서로 다른 객체이기 대문이다.
        System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
        System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        // equals() 메소드는 객체가 달라도 내용이 동일하면 true를 반환한다.
        System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        // 대소문자에 관계없이 비교하고 싶으면 equalsIgnoreCase() 메소드를 이용한다.
        System.out.printf(" str2.equalsIgnoreCase(\"abc\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
