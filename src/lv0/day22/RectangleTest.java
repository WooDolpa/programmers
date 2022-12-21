package lv0.day22;

/**
 * packageName : lv0.day22
 * className : RectangleTest
 * user : jwlee
 * date : 2022/12/19
 */
public class RectangleTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] dots = new int[][]{{1,1},{2,1},{2,2},{1,2}};
        int[][] dots = new int[][]{{-1,-1},{1,1},{1,-1},{-1,1}};
        System.out.println(solution.solution(dots));
    }

    /**
     * 직사각형 넓이
     *
     */
    public static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            boolean isDotsLen = dots.length == 4;
            if(isDotsLen) {

                int width = 0;
                int height = 0;
                int x = dots[0][0];
                int y = dots[0][1];

                for (int i=0; i< dots.length; i++) {

                    int[] dot = dots[i];
                    int dotX = dot[0];
                    int dotY = dot[1];

                    if(y == dotY) {
                        // 가로
                        width = Math.abs(x - dotX);
                    }

                    if(x == dotX) {
                        // 세로
                        height = Math.abs(y - dotY);
                    }
                }

                answer = width * height;
            }
            return answer;
        }
    }
}
