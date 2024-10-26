import java.util.ArrayList;
import java.util.List;

// Основной класс для анализа данных об успеваемости студентов
public class AcademicPerformanceAnalyzer {
    // Список всех студентов, добавленных в систему, который используется для анализа
    private final List<Student> students = new ArrayList<>();

    // Метод для вычисления средней успеваемости
    public double calculateAverageGPA(List<Student> studentList) {
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.getGpa();
        }
        return !studentList.isEmpty() ? totalGPA / studentList.size() : 0;
    }

    // Метод для разделения студентов на локальных и приезжих
    public List<Student> filterByLocation(String locationType) {
        // Логика для фильтрации студентов по местоположению
        return new ArrayList<>(students);
    }

    public List<Student> getStudents() {
        return students;
    }
}