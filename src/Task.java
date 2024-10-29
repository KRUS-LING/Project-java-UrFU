public class Task {
    private String taskName;      // Название задания
    private String taskType;      // Тип задания (например, "Упражнение", "Домашнее задание")
    private int maxScore;         // Максимальное количество баллов за выполнение задания
    private int difficulty;       // Сложность задания (например, от 1 до 5)

    public Task(String taskName, String taskType, int maxScore, int difficulty) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.maxScore = maxScore;
        this.difficulty = difficulty;
    }

    // Геттеры и сеттеры
    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getTaskType() { return taskType; }
    public void setTaskType(String taskType) { this.taskType = taskType; }

    public int getMaxScore() { return maxScore; }
    public void setMaxScore(int maxScore) { this.maxScore = maxScore; }

    public int getDifficulty() { return difficulty; }
    public void setDifficulty(int difficulty) { this.difficulty = difficulty; }
}
