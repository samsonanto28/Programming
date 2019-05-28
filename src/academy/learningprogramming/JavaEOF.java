package academy.learningprogramming;

import java.util.Scanner;

class JavaEOF {

    private Scanner scanner;

    JavaEOF() {
        scanner = new Scanner(System.in);
    }

    void solve() {
        String input;
        int i = 0;
        while (scanner.hasNext()) {
            i++;
            input = scanner.nextLine();
            System.out.printf("%d %s\n", i, input);
        }
    }


}
