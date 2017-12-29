package org.java2.filip.melerski.Zadanie009_ogólne.Zadanie004;
import java.util.Scanner;

public class ScanIn {

    Scanner scanIn = new Scanner(System.in);

    public int getTicketQty() {


        int tickets = scanIn.nextInt();

        return tickets;

    }

    public int scanPayIn() {


        int paidMoney = scanIn.nextInt();

        return paidMoney;
    }
}


