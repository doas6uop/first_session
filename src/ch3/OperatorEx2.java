package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j = i++; 실행 후, i=" + i + ", j = " + j);

        i = 5;  // 값을 다시 초기화
        j = 0;

        j = ++i;
        System.out.println("j = ++i; 실행 후, i=" + i + ", j = " + j);

        // 실행결과를 보면 i의 값은 두 경우 모두 1이 증가하여 6이 되었다.
        // 하지만 j의 값은 후위형 5, 전위형 6으로 차이가 있다.
        // 전위형: ① i의 값을 증가 ② j가 i의 값을 참조 ③ 연산결과를 j에 저장
        // 후위형: ① j가 i의 값을 참조 ② 연산결과를 j에 저장 ③ i의 값을 증가
    }
}
