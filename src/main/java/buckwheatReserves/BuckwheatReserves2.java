package buckwheatReserves;

public class BuckwheatReserves2 {

    public static void main(String[] args) {

        double howMonthWantToEatBuckwheat = 2.5;
        int priceSaveOneKgForMonth = 100;
        int eatBuckwheatForMonth = 6;
        double stockOfBuckwheatKg = howMonthWantToEatBuckwheat * eatBuckwheatForMonth; // Запас гречки на нужное колличество месяцев
        double paymentForSaveStockOfBuckwheat = stockOfBuckwheatKg * priceSaveOneKgForMonth; // оплата за первый месяц

        while (stockOfBuckwheatKg > 0) {
            stockOfBuckwheatKg -= eatBuckwheatForMonth;
            if (stockOfBuckwheatKg < 0) {
                break;
            }
            paymentForSaveStockOfBuckwheat += stockOfBuckwheatKg * priceSaveOneKgForMonth;
        }

        System.out.println("Василий заплатит за хранение: " + paymentForSaveStockOfBuckwheat);
    }

}

