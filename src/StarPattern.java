public class StarPattern {
    public static void main(String[] args) {
        SolidRectangle();
        HollowRectangle();
        LeftHalfPyramid();
        ReverseLeftPyramid();
        RightPyramid();
        ReverseRightPyramid();
        LeftNumberPyramid();
        ReverseLeftNumberPyramid();
        FloydTriangle();
        BinaryPyramid();
    }

    // This is a solid rectangle
    // *****
    // *****
    // *****
    // *****
    static void SolidRectangle() {
        System.out.println("This is a solid rectangle");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a hollow rectangle
    // *****
    // *   *
    // *   *
    // *****
    static void HollowRectangle() {
        System.out.println("This is a hollow rectangle");
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a left half pyramid
    // *
    // **
    // ***
    // ****
    // *****
    static void LeftHalfPyramid() {
        System.out.println("This is a left half pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a reverse left pyramid
    // *****
    // ****
    // ***
    // **
    // *
    static void ReverseLeftPyramid() {
        System.out.println("This is a reverse left pyramid");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a right pyramid
    //     *
    //    **
    //   ***
    //  ****
    // *****
    static void RightPyramid() {
        System.out.println("This is a right pyramid");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a reverse right pyramid
    // *****
    //  ****
    //   ***
    //    **
    //     *
    static void ReverseRightPyramid() {
        System.out.println("This is a reverse right pyramid");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a left number pyramid
    // 1
    // 12
    // 123
    // 1234
    // 12345
    static void LeftNumberPyramid() {
        System.out.println("This is a left number pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a reverse left number pyramid
    // 12345
    // 1234
    // 123
    // 12
    // 1
    static void ReverseLeftNumberPyramid() {
        System.out.println("This is a reverse left number pyramid");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is Floyd's Triangle
    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15
    static void FloydTriangle() {
        System.out.println("This is Floyd's Triangle");
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        System.out.println();
    }

    // This is a binary pyramid
    // 1
    // 01
    // 101
    // 0101
    // 10101
    static void BinaryPyramid() {
        System.out.println("This is a binary pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
