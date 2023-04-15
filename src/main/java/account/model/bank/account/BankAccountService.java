package account.model.bank.account;

import java.util.Map;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class BankAccountService {

    public BankAccount getByKontoNummer(Integer kontoNummer) {
        if (kontoNummer == null) {
            return null;
        }
        for (BankAccount bankAccount : BankAccountDB.bankAccountsDB) {
            if (bankAccount.getKontoNummer() != null) {
                if (bankAccount.getKontoNummer().equals(kontoNummer)) {
                    return bankAccount;
                }
            }
        }
        return null;
    }
}
