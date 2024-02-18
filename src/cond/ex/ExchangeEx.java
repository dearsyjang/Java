package cond.ex;

public class ExchangeEx {
    public static void main(String[] args) {
        int dollar;
        dollar = -5;
        dollar = 10;

        int won;

        String result;

        if (dollar < 0) {
            result = "잘못된 금액입니다.";
        } else if (dollar == 0) {
            result = "환전할 금액이 업습니다.";
        } else {
            won = dollar * 1300;
            result = "환전 금액은 " + won + "원입니다.";
        }

        System.out.println(result);
    }
}
