package stream_api;

public class Student {
    private String name;
    private int score;
    private int id;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() { return name; }
    public int getScore() { return score; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}
