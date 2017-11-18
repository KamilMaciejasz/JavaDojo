package lambdaBonus;

public class Employee {
    private String name;
    private double score;

    public Employee(String name, double score){
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
