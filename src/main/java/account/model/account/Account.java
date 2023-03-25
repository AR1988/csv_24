package account.model.account;

import account.model.bank.account.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class Account {
    private static Long initId = 1L;

    private final Long id;
    private final String firstName;
    private final String LastName;
    private List<BankAccount> bankAccounts = new ArrayList<>();
    private final AccountStatus status;

    public Account(String firstName, String lastName, AccountStatus status) {
        this.id = generatgeId();
        this.firstName = firstName;
        LastName = lastName;
        this.status = status;
    }

    public Account(String firstName, String lastName, List<BankAccount> bankAccounts, AccountStatus status) {
        this.id = generatgeId();
        this.firstName = firstName;
        LastName = lastName;
        this.bankAccounts = bankAccounts;
        this.status = status;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void removeBankAccount(BankAccount bankAccount) {
        bankAccounts.remove(bankAccount);
    }

    private static Long generatgeId() {
        return initId++;
    }

    public static Long getInitId() {
        return initId;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public AccountStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(firstName, account.firstName) && Objects.equals(LastName, account.LastName) && Objects.equals(bankAccounts, account.bankAccounts) && status == account.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, LastName, bankAccounts, status);
    }
}
