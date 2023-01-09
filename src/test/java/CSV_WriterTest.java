import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSV_WriterTest {
    @Test
    public void testWriteToCSV() throws IOException {
        String[][] data = {{"Student1", "7", "9"}};
        String[] header = {"Nume", "Prezenta", "nota"};
        CSV_Writer.writeToCSV(data, "test", header);

        File file = new File("test.csv");
        assertTrue(file.exists());

        String expected = "Nume,Prezenta,nota,\nStudent1,7,9,\n";
        byte[] bytes = Files.readAllBytes(Paths.get("test.csv"));
        String contents = new String(bytes);
        assertTrue(contents.equals(expected));

        file.delete();
    }
}