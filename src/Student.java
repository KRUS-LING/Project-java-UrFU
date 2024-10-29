public class Student {
    private String firstName;  // Имя студента
    private String lastName;   // Фамилия студента
    private int age;           // Возраст студента
    private String group;      // Учебная группа студента

    public Student(String firstName, String lastName, int age, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
    }

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
}
