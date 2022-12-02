public class Main {
    public static void main(String[] args) {
        String str = "mice";
        int sq =5;
        repeat(str, sq);

    }

    public static void repeat(String a, int b) { //функция, которая повторяет каждый символ в строке n раз.
        char[] vxod = a.toCharArray();
        String m="" ;

        for (int i = 0; i < vxod.length; i++) {
            System.out.print(String.valueOf(vxod[i]).repeat(b));
        }
    }
}