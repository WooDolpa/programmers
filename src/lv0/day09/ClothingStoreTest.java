package lv0.day09;

/**
 * packageName : lv0.day09
 * className : ClothingStoreTest
 * user : jwlee
 * date : 2022/11/27
 */
public class ClothingStoreTest {
    public static void main(String[] args) {

    }

    /**
     * 옷가게 할인 받기
     *
     */
    public static class Solution {
        public int solution(int price) {
            boolean isValid = (10 <= price && price <= 1000000);
            int answer = 0;
            if(isValid) {
                double discount = 0;
                int percent = 0;

                if(100000 <= price && price < 300000) {
                    percent = 5;
                }else if(300000 <= price && price < 500000) {
                    percent = 10;
                }else if(price >= 500000) {
                    percent = 20;
                }

                discount = (price * (0.01 * percent));
                return (int)(price - discount);
            }
            return answer;
        }
    }
}
