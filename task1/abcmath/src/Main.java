public class Main {
    public static void main(String[] args) {
        int a = 42;
        int b = 5;
        int c = 10;
        System.out.println("abcmath (" + a + "," + b + "," + c + ") " + abcmath(a, b, c));
    }

    public static boolean abcmath(int a, int b, int c) {
        int sum = a * 2;
        for (int i = 1; i < b; i++) { // Цикл где а добавляет к себе b раз
            sum += sum;
        }
        if (sum % 10 == 0) { //проверяем делится сумма на 10 без остатка
            return true;
        } else {
            return false;
        }
    }
}