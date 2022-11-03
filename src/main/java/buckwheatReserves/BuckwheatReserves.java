package buckwheatReserves;

public class BuckwheatReserves {

    public static void main(String[] args) {

        int stockOfBuckwheatKg = 100;
        int priceSaveOneKgForMonth = 100;
        int eatBuckwheatForMonth = 6;
        int paymentForSaveStockOfBuckwheat = stockOfBuckwheatKg * priceSaveOneKgForMonth; // оплата за первый месяц

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

