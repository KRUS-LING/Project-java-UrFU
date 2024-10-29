public class Topic {
    private String topicName;     // Название темы
    private String description;   // Описание темы

    public Topic(String topicName, String description) {
        this.topicName = topicName;
        this.description = description;
    }

    // Геттеры и сеттеры
    public String getTopicName() { return topicName; }
    public void setTopicName(String topicName) { this.topicName = topicName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
