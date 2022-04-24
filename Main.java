public class Main {
    public static final int BONUS_LIMIT = 100;

    private static int addReplenishment(int account, int replenishmentAmount) {
        int bonus = 0;
        if (replenishmentAmount > BONUS_LIMIT)
            bonus = replenishmentAmount / BONUS_LIMIT;
        return (account + replenishmentAmount + bonus);
    }

    public static void main(String[] args) {
        int account = 100;
        System.out.println("Начальный счет " + account + " рублей");
        int replenishmentAmount = 100;
        System.out.println("Пополнение " + replenishmentAmount + " рублей");
        account = addReplenishment(account, replenishmentAmount);
        System.out.println("Теперь ваш баланс составляет " + account + " рублей");

        int account2 = 100;
        System.out.println("Начальный счет " + account2 + " рублей");
        int replenishmentAmount2 = 1100;
        System.out.println("Пополнение " + replenishmentAmount2 + " рублей");
        account2 = addReplenishment(account2, replenishmentAmount2);
        System.out.println("Теперь ваш баланс составляет " + account2 + " рублей");
    }
}