package bank;

import bank.model.Account;

public class Main {
    public static void main(String[] args) {
        Account first = new Account("ACC01", "Simon", "Bilos", "08.09.2003", "+421940334177");
        System.out.println(first.getAccountInformation());
    }
}