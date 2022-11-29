public class Main {
    public static void main(String[] args) {
        int n = 30;
        int a = 15;
        int b = 2;
        System.out.println("operation ("+ n+ ", " + a+ ", " + b +") " + operation(n, a, b) );
    }

    public static String operation(int n, int a, int b) { //функция, которая принимает 3 числа и возвращает, что нужно сделать с a и b
        String answer = " ";
        if (a + b == n) {
            answer = "added";
        }
        else if (a - b == n) {
            answer = "subtracted";
        }
        else if (a * b == n) {
            answer = "multiplied";
        }
        else if (a/b ==n ){
            answer= "divided";
        }
        else {
            answer = "none";
        }
        return answer;
    }
}