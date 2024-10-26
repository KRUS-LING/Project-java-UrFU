public class Student {
    private String id; // уникальный идентификатор студента
    private String name; // имя студента
    private String surname; // фамилия студента
    private boolean isLocal; // true - местный, false - приезжий
    private double gpa; // Средний балл

    public Student(String id, String name, String surname, boolean isLocal, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isLocal = isLocal;
        this.gpa = gpa;
    }

    // Геттеры и сеттеры для полей
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public boolean isLocal() { return isLocal; }
    public void setLocal(boolean isLocal) { this.isLocal = isLocal; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}