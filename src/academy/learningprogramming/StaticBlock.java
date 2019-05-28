package academy.learningprogramming;

import java.util.Scanner;

class StaticBlock {

    private static int H;
    private static int B;
    private static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);

        H = sc.nextInt();
        B = sc.nextInt();
        if (H <= 0 || B <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    void solve() {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
