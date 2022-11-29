public class Main {
    public static void main(String[] args) {
        int i = 7;
        int j = 4;
        System.out.println("triArea ("+ i + ", "+ j +") " + triangle(i, j));
    }

    public static int triangle(int a, int h) { //функция которая возвращает площадь треугольника, принимая в качестве параметров  основание и высоту
        int s = (a * h) / 2;
        return s;
    }
}