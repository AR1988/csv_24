package account.model.account;

import account.model.bank.account.BankAccountDB;
import com.github.javafaker.Faker;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class AccountDB {
    //https://fossbytes.com/tools/random-name-generator
    public static List<Account> accountDB = List.of(
            new Account("Claudia",
                    "Chambers",
                    List.of(BankAccountDB.bankAccountsDB.get(0), BankAccountDB.bankAccountsDB.get(3)),
                    AccountStatus.ACTIVE),
            new Account("Jill",
                    "Patterson",
                    List.of(BankAccountDB.bankAccountsDB.get(1), BankAccountDB.bankAccountsDB.get(4)),
                    AccountStatus.ACTIVE),
            new Account("Dwayne",
                    "Lee",
                    List.of(BankAccountDB.bankAccountsDB.get(2)),
                    AccountStatus.ACTIVE
            ),
            new Account("David ",
                    "Ruiz",
                    List.of(BankAccountDB.bankAccountsDB.get(5)),
                    AccountStatus.ACTIVE
            ),
            new Account("Adam ",
                    "Watson",
                    List.of(BankAccountDB.bankAccountsDB.get(6)),
                    AccountStatus.INACTIVE
            )
    );
}
