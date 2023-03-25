package account.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
class CsvRowModelTest {
    @Test
    void test_createCsvRowModel() {
        List<String> columns = fillArray(19);
        CsvRowModel csvRowModel = new CsvRowModel(columns, 1);

        assertEquals("test_0", csvRowModel.getTable());
        assertEquals("test_1", csvRowModel.getTransaktionTyp());
        assertEquals("test_2", csvRowModel.getOperationTyp());
        assertEquals("test_3", csvRowModel.getTransactionsCode());
    }

    @Test()
    void test_createCsvRowModel_expectedException() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            List<String> columns = fillArray(10);
            new CsvRowModel(columns, 1);
        });
    }

    private List<String> fillArray(int columns) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            strings.add("test_" + i);
        }
        return strings;
    }
}
