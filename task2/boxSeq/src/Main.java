public class Main {
    public static void main(String[] args) {
        int a = 1;

        System.out.println("boxSeq (" + a + ") " + boxSeq(a));
    }

    public static int boxSeq(int a)
    {
        int boxcount = 0;
        for (int i = 1 ; i<=a;i++)
            if(i%2 == 1)
                boxcount +=3;
            else boxcount--;
        return boxcount;
    }
}