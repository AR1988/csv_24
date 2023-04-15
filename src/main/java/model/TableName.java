package model;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
public enum TableName {
    CASHTR("CashTransaction");

    private final String kennung;

    TableName(String code) {
        this.kennung = code;
    }

    public String getCode() {
        return kennung;
    }
}
