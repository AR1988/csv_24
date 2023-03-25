import account.model.account.Account;
import account.model.account.AccountService;
import account.model.account.AccountStatus;
import account.model.bank.account.BankAccountService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Map;

/**
 * @author Andrej Reutow
 * created on ${DATE}
 */
public class CsvImporter {
    public static void main(String[] args) {

        BankAccountService bankAccountService = new BankAccountService();
        AccountService accountService = new AccountService();
        Map<AccountStatus, List<Account>> allAccountsGroupByStatus = accountService.findAllAccountsGroupByStatus();

        System.out.println();

        readFile();
    }

    private static void readFile() {
        File dir = new File("source");
        File[] files = dir.listFiles();
        for (File file : files) {
            try {
                BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                System.out.println(attributes.creationTime());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
