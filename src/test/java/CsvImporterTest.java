import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
class CsvImporterTest {
    private static String name = "Vasja";

    @DisplayName("Тестирование чтения файла")
    @Test
    public void test_readFile() {
        List<String> strings = CsvImporter.readFile("src/test/java/test.csv");
        assertEquals(4, strings.size());
        assertEquals("TABLE;transaktion_typ;Operation_Typ;transactions code;transaktion nummer;additional " +
                        "transaktion number;betrag;currency;kontonr;blz;trans datum;valuta;mandateferenz;kunde_id;vw1;" +
                        "vw2;bemerkung 1;bemerkung 2;bemerkung 3",
                strings.get(0));
        assertEquals("CASHTR;KZUK;CREDIT;;1;1;25.98;978;1234567;100500;22.08.2022;23.08.2022;;35491698;;;;;",
                strings.get(1));
        assertEquals("CASHTR;KZUK;DEBIT;;1;2;25.98;978;7894561;100500;22.08.2022;23.08.2022;;35491698;;;;;",
                strings.get(2));
        assertEquals("CASHTR;SEPA;DEBIT;;2;1;125.98;978;12314561;102500;22.08.2022;23.08.2022;;45491698;;;;;",
                strings.get(3));
    }
}
