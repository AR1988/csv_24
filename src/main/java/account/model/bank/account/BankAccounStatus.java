package account.model.bank.account;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public enum BankAccounStatus {

    ACTIVE("A"), INACTIVE("I");

    private final String code;

    BankAccounStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
