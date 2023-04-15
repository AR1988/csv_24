package model;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
public enum OperationType {
    CREDIT("C"), DEBIT("D");
    private final String code;

    OperationType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
