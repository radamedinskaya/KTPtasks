public class Main {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("addUpTo (" + a + ") " + addUpTo(a));
    }

    public static int addUpTo(int a) { //Функция которая берет последнее число из последовательного списка чисел и возвращает сумму всех чисел до него и включая его.
        int sum = 0;
        int b = a;
        for (int i = 0; i < a; i++) {
            sum += b;
            b -= 1;
        }
        return sum;
    }
}