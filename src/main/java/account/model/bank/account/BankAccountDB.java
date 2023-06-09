package account.model.bank.account;

import account.model.bank.BankDB;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class BankAccountDB {

    //https://iban-generator.com/fake-iban-generieren/#:~:text=Die%20Kontopr%C3%BCfsumme%20der%20IBAN%20ist,Kombination%20von%20Zahlen%20korrekt%20berechnet.
    public static List<BankAccount> bankAccountsDB = List.of(
            new BankAccount(4305544, BankDB.bankDB.get(0), BankAccountStatus.ACTIVE),
            new BankAccount(2886754, BankDB.bankDB.get(1), BankAccountStatus.ACTIVE),
            new BankAccount(3549053, BankDB.bankDB.get(2), BankAccountStatus.ACTIVE),
            new BankAccount(6498694, BankDB.bankDB.get(3), BankAccountStatus.ACTIVE),
            new BankAccount(9640505, BankDB.bankDB.get(4), BankAccountStatus.ACTIVE),
            new BankAccount(7237636, BankDB.bankDB.get(5), BankAccountStatus.INACTIVE),
            new BankAccount(6473612, BankDB.bankDB.get(6), BankAccountStatus.ACTIVE)
    );
}
