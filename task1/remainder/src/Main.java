public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 3;
        System.out.println("remainder (" + i + ", " + j + " ) " + ost(i,j));
    }
    public static int ost(int a, int b){ //создаем функцию которая будет возвращать остаток от деления
        int m = a%b;
        return m;
    }
}