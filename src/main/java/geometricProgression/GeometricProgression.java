package geometricProgression;

public class GeometricProgression {

    public static void main(String[] args) {

        /**
         Сумма геометрической прогрессии для чисел от 1 до 100, каждое число при вхождении в цикл умножается на 2
         */

        int sum = 1;

        for (int i = 1; i <= 100; ) {
            i *= 2;
            if (i > 100) { // если при умножении на 2 получаем число больше 100 не прибавляем его к сумме прогрессии
                break;
            }
            sum = sum + i;
        }
        System.out.println("Сумма геометрической прогрессии: " + sum);
    }
}
