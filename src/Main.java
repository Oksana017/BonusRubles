public class Main {

    public static void main(String[] args) {
        int currentAccount = 950;
        int addAmount = 5_475;

        int bonus;
        if (addAmount  > 1000) {
            bonus = addAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = currentAccount + addAmount + bonus;
        System.out.println("Итоговая сумма на счету: " + totalAmount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
