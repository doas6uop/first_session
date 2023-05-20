package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열생성.

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for(int i =0; i < ball.length; i++)
            ball[i] = i + 1; // ball[0]에 1부터 차례대로 저장한다.

        int temp = 0;
        int j = 0;

        // 배열의 i번째 요소와 임의의 요소에 저장된값을 서로 바꿔서 값을 섞는다
        // 0번째부터 5번째요소까지 모두 6개만 바꾼다.
        for(int i =0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 0~44범위에서 임의의 값을 얻는다.
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 배열ball의 앞에서부터 6개의 요소를 출력한다.
        for(int i =0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}
