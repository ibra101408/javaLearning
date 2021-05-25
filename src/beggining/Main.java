//Find quadratic equation like ax2 + bx + c = 0//

package beggining;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        int a = con.nextInt();
        int b = con.nextInt();
        int c = con.nextInt();

        int d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);

        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);

        if (d == 0) {
            System.out.printf("One root: %.0f\n", x1);
        } else if (d < 0) {
            System.out.printf("No roots\n");
        } else if (x1 < x2) {
            System.out.printf("Two roots: %.0f %.0f\n", x1, x2);
        } else {
            System.out.printf("Two roots: %.0f %.0f\n ", x2, x1);
        }
    }
}