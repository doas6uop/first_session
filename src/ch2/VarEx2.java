package ch2;
public class VarEx2 {
    public static void main(String[] args) {
        // 두 변수의 값 교환하기
        int x = 10, y = 20, z = 30;
        int temp = 0;

        System.out.println("최초로 초기화된 변수 출력");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        // java 코드는 실행될 경우 좌측에서 우측으로, 위에서 아래로 진행된다.
        // 이 때, 각 변수를 이용하여 서로의 값으로 재정의하려 할 경우, 코드는 순서대로 진행되어 먼저 초기화된 변수의 값으로 덮어씌워지게 된다.
        // 따라서 별도의 변수를 생성하여 초기화하기 전에 값을 저장하는 방법이 존재한다.

        z = x;
        x = z;

        System.out.println();
        System.out.println("두 변수가 서로를 초기화할 경우 아래와 같이 먼저 초기화된 변수의 값만 남게 된다.");
        System.out.println("x: " + x);
        System.out.println("z: " + z);

        temp = x;
        x = y;
        y = temp;

        System.out.println();
        System.out.println("temp 변수를 통해 값이 뒤바꾼 변수 출력");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println();
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();
        System.out.println("덧셈 연산자 + 는 숫자 유형의 값을 더하기도 하나, 문자열(String)이 결합될 경우 문자열로 결합 및 변경된다.");
        System.out.println("" + x + y);


    }
}
