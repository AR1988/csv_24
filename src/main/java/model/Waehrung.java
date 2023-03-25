package model;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public enum Waehrung {
    USD(840, "Доллар США"),

    EUR(978, "Евро"),

    GBP(826, "Фунт стерлингов Великобритании"),

    JPY(392, "Японская йена"),

    CHF(756, "Швейцарский франк"),

    CNY(156, "Китайский юань женьминьби");

    private final Integer code;
    private final String description;

    Waehrung(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }


    public static Waehrung findByCode(Integer code) {
        if (code == null) {
            return null;
        }
        return Arrays.stream(Waehrung.values())
                .filter(waehrung -> waehrung.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
