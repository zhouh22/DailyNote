/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n≤39
 */

public class FourTest {
    public int Fibonacci(int n) {
        int[] arr = new int[40];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < 40; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
