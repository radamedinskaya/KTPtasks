import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] array = {44, 32, 86, 19}; //объявляем и инициализируем массив
        System.out.println("differenceMaxMin (" +(Arrays.toString(array))+ ") " + differenceMaxMin(array));
    }

    public static int differenceMaxMin(int[] a) {
        Arrays.sort(a);
        int max = a[a.length - 1];
        int min = a[0];
        int sum = max - min;
        return sum;
    }
}