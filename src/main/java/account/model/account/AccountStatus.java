package account.model.account;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public enum AccountStatus {
    ACTIVE("A"), INACTIVE("I");

    private final String code;

    AccountStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
