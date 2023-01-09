import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Writer {
    public static void writeToCSV(String[][] data, String fileName, String[] header) {
        File file = new File(fileName + ".csv");
        try {
            FileWriter writer = new FileWriter(file);


            for (String str : header) {
                writer.write(str + ",");
            }
            writer.write("\n");


            for (String[] row : data) {
                for (String str : row) {
                    writer.write(str + ",");
                }
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}