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
        return BankAccountDB.bankAccountsDB.stream()
                .filter(bankAccount -> bankAccount.getKontoNummer() != null)
                .filter(bankAccount -> bankAccount.getKontoNummer().equals(kontoNummer))
                .findFirst()
                .orElse(null);
    }
}
