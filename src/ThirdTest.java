public class ThirdTest {
    public static void SwapTwoNumbers(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Fornecer números válidos.");
            return;
        }

        System.out.printf("Before Swap: x: %d, y: %d\n", x, y);

        y = y - x;
        x = x + y;
        y = x - y;

        System.out.printf("After Swap: x: %d, y: %d\n", x, y);
    }
}
