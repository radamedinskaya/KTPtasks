public class Main {
    public static void main(String[] args){ //Задаем параметры
        double prob = 0.9;
        int prize = 3;
        int pay =2;
        System.out.println("profitGamble (" + prob + ", " + prize + ", " + pay + ") "+ gambel(prob, prize, pay));

    }
    public static boolean gambel (double a, int b, int c){ //функция которая принимает три аргумента (prob, prize, pay) и возвращает true, если prob * prize > pay; в противном случае возвращает false
        if(a*b>c){ //с помощью оператора if проверяем условие
            return true;
        } else {
            return false;
        }

    }
}