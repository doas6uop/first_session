package ch2;

public class VarEx1 {
    public static void main(String[] args) {
        // 1. 변수 선언
        int year = 0; // 변수타입, 변수명, 대입연산자, 선언자를 통해 변수선언 및 초기화.
        int age = 14;

        // 2. 변수 출력
        System.out.println("year(1): " + year);
        System.out.println("age(1): " + age);

        // 3. 변수 재정의(대입연산, =)을 이용
        year = age + 2000; // 변수 age에 저장된 값(14)을 읽어와, 2000을 더하여 변수 year에 저장
        age = age + 1 ;     // 변수 age에 저장된 값(14)을 읽어와, 1을 더하여 변수 age(자기자신)에 저장

        // 4. 변수 출력
        System.out.println("year(2): " + year); // 재정의된 값이 출력된다.
        System.out.println("age(2): " + age);

    }
}
