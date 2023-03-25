package account.model.bank.account;

import account.model.bank.Bank;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class BankAccount {
    private static Long initId = 1L;

    private final Long id;
    private final Integer kontoNummer;
    private final Bank bank;
    private final BankAccounStatus status;

    public BankAccount(Integer kontoNummer, Bank bank, BankAccounStatus status) {
        this.id = generateId();
        this.kontoNummer = kontoNummer;
        this.bank = bank;
        this.status = status;
    }

    private static Long generateId() {
        return initId++;
    }

    public Long getId() {
        return id;
    }

    public Integer getKontoNummer() {
        return kontoNummer;
    }

    public Bank getBank() {
        return bank;
    }

    public BankAccounStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id) && Objects.equals(kontoNummer, that.kontoNummer) && Objects.equals(bank, that.bank) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kontoNummer, bank, status);
    }
}
