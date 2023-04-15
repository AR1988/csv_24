package account.model;

import model.OperationType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
//    @Test
//    void test_mapToInt_return1() {
//        Integer result = CsvParser.toInt("1", errors, columnNames.get(4));
//        assertEquals(1, result);
//    }


    @Test
    void test_mapToOperationTypeEnum() {
        String value = "CREDIT";
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName);

        assertEquals(OperationType.CREDIT, resultEnum);
    }

    @Test
    void test_mapToOperationTypeEnum_invalideValue() {
        String value = "ABC";
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName);

        assertNull(resultEnum);
        assertEquals(1, errors.size());
        assertEquals(String.format(CsvParser.ERROR_MSG_PARSE_TO_OT_ENUM, columnName, value), errors.get(0));
    }

    @Test
    void test_mapToOperationTypeEnum_valueIsNull() {
        String value = null;
        String columnName = "OPERATION_TYPE";

        OperationType resultEnum = CsvParser.toOperationTypeEnum(value, errors, columnName);

        assertNull(resultEnum);
        assertEquals(1, errors.size());
        assertEquals(String.format(CsvParser.ERROR_MSG_STR_IS_BLANK, columnName, value), errors.get(0));
    }
}
