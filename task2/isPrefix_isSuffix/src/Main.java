public class Main {
    public static void main(String[] args) {
        String s1 = "automation";
        String s2 = "auto";

        System.out.println("isSuffix (" + s1 + "," + s2 +") " + isSuffix(s1,s2));
        System.out.println("isPrefix (" + s1 + ", " + s2 + ") " + isPrefix(s1,s2));
    }

    public static boolean isSuffix(String str, String pref) {
        String test = str.substring(str.length() - pref.length());
        if (pref.equals(str.substring(str.length() - pref.length())))
            return true;
        else return false;
    }

    public static boolean isPrefix(String str, String pref) {
        String test = str.substring(pref.length());
        if (pref.equals(str.substring(0, pref.length())))
            return true;
        else return false;
    }
}