package primeNumbers;

import primeNumbers.Numbers;

public class App {

    public static void main(String[] args) {

        int num = 11;
        if (Numbers.isPrimeNumber(num)) {
            System.out.println("Число " + num + " является простым числом");
        } else {
            System.out.println("Число " + num + " не является простым числом");
        }


    }
}
