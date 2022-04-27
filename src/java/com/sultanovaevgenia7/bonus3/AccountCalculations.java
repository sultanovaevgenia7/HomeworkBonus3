package com.sultanovaevgenia7.bonus3;

public class AccountCalculations {
    public static final int BONUS_LIMIT = 100;

    private int addReplenishment(int account, int replenishmentAmount) {
        int bonus = 0;
        if (replenishmentAmount > BONUS_LIMIT)
            bonus = replenishmentAmount / BONUS_LIMIT;
        return (account + replenishmentAmount + bonus);
    }

    private void runCalculations(){
        int account = 100;
        System.out.println("Начальный счет " + account + " рублей");
        int replenishmentAmount = 100;
        System.out.println("Пополнение " + replenishmentAmount + " рублей");
        account = addReplenishment(account, replenishmentAmount);
        System.out.println("Теперь ваш баланс составляет " + account + " рублей");

        int replenishmentAmount2 = 1100;
        System.out.println("Пополнение " + replenishmentAmount2 + " рублей");
        account = addReplenishment(account, replenishmentAmount2);
        System.out.println("Теперь ваш баланс составляет " + account + " рублей");
    }

    public static void main(String[] args) {
        AccountCalculations acc = new AccountCalculations();
        acc.runCalculations();
    }
}