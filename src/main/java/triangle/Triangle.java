package triangle;

public class Triangle {

    public static void main(String[] args) {

        int a = 10;
        for (int i = 0; i <= a; i++) {

            //Левое пустое пространство
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
