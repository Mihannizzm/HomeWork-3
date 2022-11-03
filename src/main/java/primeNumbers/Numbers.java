package primeNumbers;


public class Numbers {

    /**
     * Метод проверяет является ли число простым
     */

    public static boolean isPrimeNumber(int num) {

        boolean isPrimeNumber = true; // 2 не войдет в цикл, является самым маленьким простым числом, метод вернет true

        if (num == 1) {
            isPrimeNumber = false; // для 1 нет проверок в цикле, не является простым числом
        } else {
            int i = 2;

            while (i != num) {

                if (num % i == 0) {
                    isPrimeNumber = false;
                    break;
                } else {
                    isPrimeNumber = true;
                }
                i++;
            }
        }

        return isPrimeNumber;

    }
}
