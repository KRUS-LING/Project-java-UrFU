import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CSVParser {
    // Принимает filePath — путь к CSV-файлу — и возвращает список students, содержащий объекты Student
    public List<Student> parse(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath)); // читает все строки из CSV-файла

        return students;
    }
}