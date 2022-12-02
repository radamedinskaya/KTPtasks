import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 3, -2, 408, 3, 3};
        System.out.println("cumulativeSum ("+ Arrays.toString(arr) + ") " + cumulativeSum(arr));
    }

    public static List<String> cumulativeSum(int[] arr) {
        List<String> sumArr = new ArrayList<String>();
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            String s = "" + sum;
            sumArr.add(s);
        }
        return sumArr;
    }
}