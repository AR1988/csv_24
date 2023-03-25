package account.model.bank;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class Bank {

    /**
     * bank id, unique
     */
    private final Long blz;
    private final String name;
    private final String ort;
    private final String bic;

    public Bank(Long id, String name, String ort, String bic) {
        this.blz = id;
        this.name = name;
        this.ort = ort;
        this.bic = bic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(blz, bank.blz) && Objects.equals(name, bank.name) && Objects.equals(ort, bank.ort) && Objects.equals(bic, bank.bic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blz, name, ort, bic);
    }
}
