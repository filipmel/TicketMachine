package org.java2.filip.melerski.Zadanie009_ogólne.Zadanie004;

public class CashMachine {

    public int toPay(int ticketsQty) {

        int toBePaid = ticketsQty * 4;

        return toBePaid;
    }

    public int countChange(int toBePaid, int paidMoney) {

        int change;

        change = paidMoney - toBePaid;
        System.out.println("Your change is: " + change + "\n");
        int changeTemp=change;

        int[] coinsAndNotes = {1, 2, 5, 10, 20, 50, 100, 200};
        int[] value = new int[10];
        int[] qty = new int[10];

        int i;
        int j = 0;

        for (i = coinsAndNotes.length - 1; i >= 0; i--) {
            if ((change / coinsAndNotes[i]) != 0) {
                System.out.println("Note/coin: " + coinsAndNotes[i] + " PLN x " + change / coinsAndNotes[i] + "\n");

                value[j] = coinsAndNotes[i];
                qty[j] = change / coinsAndNotes[i];

                change = change % coinsAndNotes[i];

                j++;
            }
        }

        System.out.println("Read form arrays: \n");

        for (i = 0; i < qty.length; i++) {

            if (qty[i] != 0) {

                System.out.println("Note/coin: " + qty[i] + " x " + value[i] + " PLN\n");
            }
        }

        return changeTemp;
    }
}
