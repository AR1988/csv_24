package account.model;

import model.OperationType;
import model.TableName;
import model.TransactionType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
public class CsvParser {

    public static final String ERROR_MSG_PARSE_TO_INT = "Column: %s Error: Can not parse value: %s to integer";
    public static final String ERROR_MSG_PARSE_TO_LONG = "Column: %s Error: Can not parse value: %s to long";
    public static final String ERROR_MSG_PARSE_TO_OT_ENUM = "Column: %s Error: Can not parse value: %s to operation type";
    public static final String ERROR_MSG_STR_IS_BLANK = "%s Value: %s is empty or null";

    public static Long toLong(String value, List<String> errors, String columnName) {
        Long result = null;
        try {
            result = Long.parseLong(value);
        } catch (NumberFormatException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_LONG, columnName, result));
        }
        return result;
    }

    public static Integer toInt(String value, List<String> errors, String columnName) {
        Integer result = null;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_INT, columnName, result));
        }
        return result;
    }

    public static TableName toTableEnum(String value, List<String> errors, String columnName) {
        if (value.isBlank()) {
            errors.add(String.format(ERROR_MSG_STR_IS_BLANK, columnName, value));
            return null;
        }
        TableName result = null;
        try {
            result = TableName.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            errors.add(String.format(ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value));
        }
        return result;
    }

    public static TransactionType toTransactionTypeEnum(String value, List<String> errors, String columnName) {
        if (value.isBlank()) {
            errors.add(String.format(ERROR_MSG_STR_IS_BLANK, columnName, value));
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

    public static OperationType toOperationTypeEnum(String value, List<String> errors, String columnName) {
        if (StringUtils.isBlank(value)) {
            errors.add(String.format(ERROR_MSG_STR_IS_BLANK, columnName, value));
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
}
