import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 9}; //объявляем и инициализируем массив
        System.out.println("sumOFCubes (" + (Arrays.toString(array)) + ") " + sumOfCubes(array));
    }
    public static int sumOfCubes(int[] a){//Создайте функцию, которая принимает массив чисел и возвращает сумму его кубов.
        double sum = 0;//переменная для подсчета суммы
        for (int i = 0; i < a.length; i++) { // Цикл для подсчета всех переменных массива с возвидением в куб
            double s = Math.pow(a[i],3);
            sum = sum + s;
        }
        return (int)sum;
    }
}