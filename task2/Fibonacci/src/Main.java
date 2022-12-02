public class Main {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("Fibonacci ("+ a + ") " + Fibonacci(a));
    }

    public static int Fibonacci(int n) {
        int ans = 1, prev = 0;
        for (int i = 1; i <= n; i++) {
            ans += prev;
            prev = ans - prev;
        }
        return ans;
    }
}