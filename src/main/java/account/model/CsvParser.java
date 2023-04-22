package account.model;

import model.OperationType;
import model.TableName;
import model.TransactionType;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
public class CsvParser {

    public static final String ERROR_MSG_PARSE_TO_INT = "Column: %s Error: Can not parse value: '%s' to integer";
    public static final String ERROR_MSG_PARSE_TO_LONG = "Column: %s Error: Can not parse value: '%s' to long";
    public static final String ERROR_MSG_PARSE_TO_OT_ENUM = "Column: %s Error: Can not parse value: '%s' to operation type";
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final String ERROR_MSG_PARSE_TO_OT_DATE = "Column: %s Error: Can not parse value: '%s' to Date. Use date format: " + DATE_FORMAT;
    public static final String ERROR_MSG_STR_IS_BLANK = "Column: %s Error: Value: '%s' is empty or null";
    public static final String ERROR_MSG_REQUIRED = "Column: %s Error: is required but not exist";

    public static Long toLong(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        Long result = null;
        try {
            result = Long.parseLong(value);
        } catch (NumberFormatException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_LONG, columnName, value));
        }
        return result;
    }

    public static Integer toInt(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        Integer result = null;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_INT, columnName, value));
        }
        return result;
    }

    public static Double toDouble(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        Double result = null;
        try {
            result = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_INT, columnName, value));
        }
        return result;
    }

    public static TableName toTableEnum(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        TableName result = null;
        try {
            result = TableName.valueOf(StringUtils.upperCase(value));
        } catch (IllegalArgumentException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value));
        }
        return result;
    }

    public static LocalDate toDate(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        LocalDate result = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
            result = LocalDate.parse(value, formatter);
        } catch (DateTimeParseException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_OT_DATE, columnName, value));
        }
        return result;
    }

    public static TransactionType toTransactionTypeEnum(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        TransactionType result = null;
        try {
            result = TransactionType.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value));
        }
        return result;
    }

    public static OperationType toOperationTypeEnum(String value, List<String> errors, String columnName, boolean required) {
        if (isRequired(value, errors, columnName, required)) {
            return null;
        }

        OperationType result = null;
        try {
            result = OperationType.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value));
        }
        return result;
    }

    public static String toString(String value, List<String> errors, String columnName, boolean required) {
        isRequired(value, errors, columnName, required);
        return value;
    }

    private static boolean isRequired(String value, List<String> errors, String columnName, boolean required) {
        if (required && StringUtils.isBlank(value)) {
            errors.add(String.format(ERROR_MSG_REQUIRED, columnName));
            return true;
        } else {
            return false;
        }
    }
}
