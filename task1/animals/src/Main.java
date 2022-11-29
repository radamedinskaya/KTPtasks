public class Main {
    public static void main(String[] args) {
        int chickens = 5;
        int cows = 2;
        int pigs = 8;
        System.out.println("animals (" + chickens+ ", " + cows + ", " + pigs + ") " + count(chickens, cows, pigs));
    }

    public static int count(int a, int b, int c) { //функция которая возвращает количество ног животных, принимая в качестве параметров количество животных
        int chickensLegs = 2;
        int cowLegs = 4;
        int pigsLegs = 4;
        int amount = a * chickensLegs + b * cowLegs + c * pigsLegs;
        return amount;

    }
}