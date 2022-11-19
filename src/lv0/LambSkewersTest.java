package lv0;

/**
 * packageName : lv0
 * className : LambSkewersTest
 * user : jwlee
 * date : 2022/11/18
 */
public class LambSkewersTest {

    public static void main(String[] args) {

    }

    /**
     * 양꼬치 금액 계산
     * 10인분을 먹으면 음료수 한개 서비스
     * 1인분에 12,000 원, 음료수는 2,000원
     * n : 양꼬치 인분
     * k : 음료수 개수
     * 총 지불할 금액을 구하라
     */
    public static class Solution{

        public int solution(int n, int k) {
            boolean isValid = (0 < n && n < 1000) && (n/10 <= k && k < 1000);
            int answer = 0;

            if(isValid) {
                int discount = n/10;
                answer = (12000 * n) + ((k-discount) * 2000);
                return answer;
            }

            return answer;
        }
    }

}
