public class Main {
    public static void main(String[] args) {
        String s1 = "ratio";
        String s2 = "orator";
        System.out.println("cumulativeSum (" + s1 +"," + s2 + ") " + isStrangePair(s1,s2));
    }
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.charAt(str1.length() - 1) == str2.charAt(0) && str2.charAt(str2.length() - 1) == str1.charAt(0))
            return true;
        else return false;
    }
}