package org.java2.filip.melerski.Zadanie009_ogólne.Zadanie004;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to ticket machine. \nPrice per tikcet: 4 PLN. \nHow many tickets you would like to buy?");

        ScanIn MyScanner = new ScanIn();
        int ticketsQty = MyScanner.getTicketQty();

        CashMachine Cashier = new CashMachine();

        int toBePaid = Cashier.toPay(ticketsQty);

        System.out.println("\tPlease pay: " + toBePaid + " PLN.\n \tInsert money.");

        int paidMoney = MyScanner.scanPayIn();

        while (paidMoney < toBePaid) {

            System.out.println("You inserted: " + paidMoney + " PLN. Please pay " + toBePaid + " PLN\n");

            paidMoney = MyScanner.scanPayIn();
        }
        System.out.println("You inserted: " + paidMoney + " PLN.");

       int change = Cashier.countChange(toBePaid, paidMoney);

    }

}