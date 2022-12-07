package lv0.day17;

/**
 * packageName : lv0.day17
 * className : TwoDimensionalTest
 * user : jwlee
 * date : 2022/12/07
 */
public class TwoDimensionalTest {
    public static void main(String[] args) {

    }

    /**
     * 2차원으로 만들기
     */
    public static class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n];
            int idx = 0;
            for (int i=0; i < num_list.length/n; i++) {
                int[] a = new int[n];
                for (int k=0; k < n; k++) {
                    a[k] = num_list[idx];
                    idx++;
                }
                answer[i] = a;
            }
            return answer;
        }
    }
}
