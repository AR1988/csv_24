package model;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
public enum TransactionType {
    KZUK("C"), SEPA("D");
    private final String code;

    TransactionType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
