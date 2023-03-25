package account.model.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class AccountService {
    public List<Account> findAccountsByStatus(AccountStatus status) {
        return AccountDB.accountDB.stream()
                .filter(account -> account.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public Map<AccountStatus, List<Account>> findAllAccountsGroupByStatus() {
        Map<AccountStatus, List<Account>> result = new HashMap<>();
        for (Account account : AccountDB.accountDB) {
            if (result.containsKey(account.getStatus())) {
                result.get(account.getStatus()).add(account);
            } else {
                List<Account> accounts = new ArrayList<>();
                accounts.add(account);
                result.put(account.getStatus(), accounts);
            }
        }
        return result;
    }
}
