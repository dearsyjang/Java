package loop.Ex;

public class NestedEx2 {
    public static void main(String[] args) {

        int row = 5;

         for (int i = 1; i <= row; i ++) {
             for (int j = 1; j <= i; j ++) {
                 System.out.print('*'); // 라인을 넘기지 않고 출력
             }
             System.out.println(); // 출력후 다음 라인
         }

    }
}
