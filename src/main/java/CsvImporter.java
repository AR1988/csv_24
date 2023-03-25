import account.model.CsvRowModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on ${DATE}
 */
public class CsvImporter {
    public static void main(String[] args) {
        List<String> strings = readFile("source/test.csv");

        List<CsvRowModel> csvRowModels = new ArrayList<>();
        for (int i = 1; i < strings.size(); i++) {
            List<String> splitColumns = List.of(strings.get(i).split(";", -1));
            CsvRowModel csvRowModel = new CsvRowModel(splitColumns, (i + 1));
            csvRowModels.add(csvRowModel);
        }
    }


    public static List<String> readFile(String pathToFile) {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathToFile));
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
