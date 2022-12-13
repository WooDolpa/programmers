package lv0.day19;

/**
 * packageName : lv0.day19
 * className : SplitStringArray
 * user : jwlee
 * date : 2022/12/11
 */
public class SplitStringArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] array = solution.solution("abc1Addfggg4556b", 6);
        String[] array = solution.solution("abcdef123", 3);
        for (String arr : array) {
            System.out.println(arr);
        }
    }

    /**
     * 잘라서 배열로 저장하기
     *
     */
    public static class Solution {
        public String[] solution(String my_str, int n){

            boolean isLen = 1 <= my_str.length() && my_str.length() <= 100;
            boolean isValid = 1 <= n && n <= my_str.length();
            String[] answer = {};

            if(isLen && isValid) {
                int size = my_str.length() % n == 0 ? my_str.length()/n : my_str.length()/n + 1;
                answer = new String[size];
                for (int i=0; i<size; i++) {
                    int startIndex = n * i;
                    if(i == (size-1)) {
                        answer[i] = my_str.substring(startIndex);
                    }else{
                        answer[i] = my_str.substring(startIndex, startIndex+n);
                    }
                }
            }

            return answer;
        }
    }
}
