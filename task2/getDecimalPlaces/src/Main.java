public class Main {
    public static void main(String[] args) {
        String a = "43.20";
        System.out.println("getDecimalPlaces ("+ a + ") " + getDecimalPlaces(a));
    }

    public static int getDecimalPlaces(String num) {
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i <= num.length() - 1; i++) {
            if (flag == true)
                counter++;
            if (num.charAt(i) == '.')
                flag = true;
        }
        return counter;
    }
}