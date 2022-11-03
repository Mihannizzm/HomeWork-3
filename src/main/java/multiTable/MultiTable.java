package multiTable;

public class MultiTable {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                Integer result = i * j;
                int resultString = result.toString().length();
                if (resultString == 1) {
                    System.out.print("  " + result);
                } else {
                    System.out.print(" " + result);
                }
            }
            System.out.println();
        }
    }
}
