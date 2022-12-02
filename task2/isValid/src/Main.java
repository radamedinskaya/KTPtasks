public class Main {
    public static void main(String[] args) {
        String i = "853a7";
        System.out.println("isValid ("+ i + ") " + isValid(i));
    }

    public static boolean isValid(String num) {
        boolean flag = false;
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        if (num.length() > 5)
            return false;
        for (int i = 0; i <= num.length() - 1; i++) {
            flag = false;
            for (int j = 0; j <= digits.length - 1; j++) {
                if (num.charAt(i) == digits[j]) {
                    flag = true;
                }
            }
            if (flag == false)
                return flag;
        }
        return flag;
    }
}