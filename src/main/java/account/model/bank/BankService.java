package account.model.bank;

import java.util.Map;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class BankService {

    public Bank getBankByBlz(Long blz) {
        if (blz == null) {
            return null;
        }
        return BankDB.bankDBById.get(blz);
    }
}
