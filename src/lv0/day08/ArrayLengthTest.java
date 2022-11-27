package lv0.day08;

/**
 * packageName : lv0.day08
 * className : ArrayLengthTest
 * user : jwlee
 * date : 2022/11/27
 */
public class ArrayLengthTest {

    public static void main(String[] args) {

    }

    /**
     * 배열 원소의 길이
     *
     * return Arrays.stream(strList).mapToInt(String::length).toArray();
     */
    public static class Solution {
        public int[] solution(String[] strlist) {
            boolean isValidLen = (1 <= strlist.length && strlist.length <= 100);
            int[] answer = {};
            if(isValidLen) {
                answer = new int[strlist.length];
                for (int i=0; i < strlist.length; i++) {
                    answer[i] = strlist[i].length();
                }
            }
            return answer;
        }
    }
}
