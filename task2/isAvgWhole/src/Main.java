import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] array = {1, 3}; //объявляем и инициализируем массив
        System.out.println("isAvgWhole (" +(Arrays.toString(array))+ ") " + isAvgWhole(array));
    }

    public static boolean isAvgWhole(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double srez = sum / a.length;
        if (srez%2==0) {
            return true;
        } else {
            return false;
        }

    }
}