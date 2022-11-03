package strangeSum;

public class StrangeSum {

    public static void main(String[] args) {

        int a = 1;

        for (int b = 2; b <= 100; b++) {
            a -= b;
            if (b == 100) { // при достижении 100 прибавлять следующее число не требуется
                break;
            }
            b++;
            a += b;
        }

        System.out.println("Странная сумма: " + a);
    }
}
