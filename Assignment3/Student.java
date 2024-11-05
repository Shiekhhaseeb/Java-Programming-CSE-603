import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private ArrayList<Double> grades;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.size() > 0 ? sum / grades.size() : 0;
    }

    public double findHighest() {
        return grades.stream().max(Double::compare).orElse(0.0);
    }

    public double findLowest() {
        return grades.stream().min(Double::compare).orElse(0.0);
    }

    public void displayGradeReport() {
        System.out.println("Grade Report for " + name + " (" + ID + ")");
        System.out.println("Average: " + calculateAverage());
        System.out.println("Highest: " + findHighest());
        System.out.println("Lowest: " + findLowest());
    }
}
