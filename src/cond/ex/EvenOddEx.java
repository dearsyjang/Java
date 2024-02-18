package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x;
        x = 2;
        x = 3;

        String result;

        result = (x % 2 == 1) ? "홀수" : "짝수";

//        if (x % 2 == 1) {
//            result = "홀수";
//        } else {

//            result = "짝수";
//        }

        System.out.println("숫자 " + x + "는 " + result + "입니다." );
    }
}
