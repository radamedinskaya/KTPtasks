public class Main {
    public static void main(String[] args){
        int side1 = 5;
        int side2 = 7;
        System.out.println("nextEdge ("+side1+", "+side2+") " + nextEdge(side1,side2));
    }
    public static int nextEdge(int a, int b) { // функцию, которая находит максимальное значение третьего ребра треугольника
        int area = (a + b) - 1;
        return area;
    }
}