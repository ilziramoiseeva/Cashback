public class Main {
    public static void main(String[] args) {
        int regularPercent = 1;
        int increasedPercent = 5;
        int specialPercent = 30;
        int regularCategoryCost = 2_300_00;
        int increasedCategoryCost = 3_000_00;
        int specialCategoryCost = 10500_00;
        int maxCashback = 3000_00;
        int regularCashback = regularCategoryCost * regularPercent / 100;
        int increasedCashback = increasedCategoryCost * increasedPercent / 100;
        int specialCashback = specialCategoryCost * specialPercent / 100;
        int allCashback = regularCashback + increasedCashback + specialCashback;
        if (allCashback > maxCashback) {
            allCashback=maxCashback;
        }
        System.out.println(allCashback);
    }
}
