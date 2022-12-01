package lv0.day12;

import java.util.Scanner;

/**
 * packageName : lv0.day12
 * className : RightTriangleTest
 * user : jwlee
 * date : 2022/11/30
 */
public class RightTriangleTest {


    /**
     * 직각삼각형 출력하기 - 별찍기
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isValid = (1 <= n && n <= 10);

        if(isValid) {
//            for (int i=1; i <= n; i++) {
//                for (int k=1; k <= i; k++) {
//                    System.out.print("*");
//                }
//                System.out.print("\n");
//            }
            for (int i=1; i <= n; i++) {
                System.out.println("*".repeat(i));
            }
        }else{
            System.out.println(n);
        }
    }

}
