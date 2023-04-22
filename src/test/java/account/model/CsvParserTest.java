package account.model;

import model.OperationType;
import model.TableName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andrej Reutow
 * created on 15.04.2023
 */
class CsvParserTest {

    private List<String> errors;

    @BeforeEach
    void setUp() {
        errors = new ArrayList<>();
    }

    //    @Test
//    void test_mapToLong_throwException() {
//        Long result = CsvParser.toLong("abc", errors, columnNames.get(9));
//
//        assertNull(result);
//        assertEquals(1, errors.size());
//        assertEquals(String.format(CsvParser.ERROR_MSG_PARSE_TO_LONG, "abc"), errors.get(0));
//    }
//
//    @Test
//    void test_mapToLong_return1() {
//        Long result = CsvParser.toLong("1", errors, columnNames.get(9));
//        assertEquals(1L, result);
//    }
//
//    @Test
//    void test_mapToInt_addMsgtoErrorList() {
//        Integer result = CsvParser.toInt("abc", errors, columnNames.get(4));
//
//        assertNull(result);
//        assertEquals(1, errors.size());
//        assertEquals(String.format(CsvParser.ERROR_MSG_PARSE_TO_INT, "abc"), errors.get(0));
//    }
//
    @Test
    void test_mapToInt_return1() {
        TableName result = CsvParser.toTableEnum(null, errors, "SOME_NAME", true);
        assertEquals(1, result);
    }

    @Test
    void test_map_toDate_FormatYYYY_mm_dd() {
        String dateAsString = "31.12.2022";
        LocalDate result = CsvParser.toDate(dateAsString, errors, "DATE", true);
        LocalDate expectedDate = LocalDate.of(2022, 12, 31);
        Assertions.assertEquals(expectedDate, result);
    }


    @Test
    void test_mapToOperationTypeEnum() {
        String value = "CREDIT";
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName, true);

        assertEquals(OperationType.CREDIT, resultEnum);
    }


    @Test
    void test_isRequired() {
        String value = "CREDIT";
        String result = CsvParser.toString(value, errors, "COLUMN", true);

        assertNotNull(result);
        assertEquals(value, result);
        assertTrue(errors.isEmpty(), "Errors size: " + errors.size());
    }

    @Test
    void test_isRequiredAndRequiredIsFalse() {
        String value = "CREDIT";
        String result = CsvParser.toString(value, errors, "COLUMN", false);

        assertNotNull(result);
        assertEquals(value, result);
        assertTrue(errors.isEmpty(), "Errors size: " + errors.size());
    }

    @Test
    void test_isRequired_valueIsNull() {
        String value = null;
        String columName = "COLUMN";
        String result = CsvParser.toString(value, errors, columName, true);

        assertNull(result);
        assertEquals(1, errors.size(), "Errors size: " + errors.size());
        assertEquals(String.format(CsvParser.ERROR_MSG_REQUIRED, columName), errors.get(0));
    }

    @Test
    void test_isRequired_valueIsNullAndRequiredIsFalse() {
        String value = null;
        String columName = "COLUMN";
        String result = CsvParser.toString(value, errors, columName, false);

        assertNull(result);
        assertTrue(errors.isEmpty(), "Errors size: " + errors.size());
    }

    @Test
    void test_mapToOperationTypeEnum_invalideValue() {
        String value = "ABC";
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName, true);

        assertNull(resultEnum);
        assertEquals(1, errors.size());
        assertEquals(String.format(CsvParser.ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value), errors.get(0));
    }

    @Test
    void test_mapToOperationTypeEnum_valueIsNull() {
        String value = null;
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName, true);

        assertNull(resultEnum);
        assertEquals(1, errors.size());
        assertEquals(String.format(CsvParser.ERROR_MSG_STR_IS_BLANK, columnName, value), errors.get(0));
    }
}
