package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating;
        rating = 9;
        rating = 7.1;
        String result = "";

        if (rating >= 9) {
            result = "어바웃타임";
        } else if (rating >= 8) {
            result = "토이 스토리";
        } else if (rating >= 7) {
            result = "고질라";
        }

        System.out.println(result +"을 추천합니다.");
    }
}
