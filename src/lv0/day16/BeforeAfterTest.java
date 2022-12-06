package lv0.day16;

/**
 * packageName : lv0.day16
 * className : BeforeAfterTest
 * user : jwlee
 * date : 2022/12/06
 */
public class BeforeAfterTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("olleh", "hello"));
    }

    /**
     * A로 B 만들기
     * 계수 정렬 사용
     */
    public static class Solution {

        public int solution(String before, String after) {
            int[] beforeArr = countCharNum(before);
            int[] afterArr = countCharNum(after);

            for (int i = 0; i < afterArr.length; i++) {
                int bi = beforeArr[i];
                int ai = afterArr[i];

                if (bi != ai) {
                    return 0;
                }
            }

            return 1;
        }

        private int[] countCharNum(String str) {
            int[] rtArr = new int[30];

            for (int i = 0; i < str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                rtArr[idx]++;
            }

            return rtArr;
        }

    }
}
