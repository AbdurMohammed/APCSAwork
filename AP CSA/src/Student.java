//Abdur Mohammed
//Period 5

public class Student {
    String name;
    int totalQuizScore;
    int numQuizzes;

    public Student(String name, int totalQuizScore, int numQuizzes){
        this.name = name;
        this.totalQuizScore = totalQuizScore;
        this.numQuizzes = numQuizzes;
    }

    public String getName(){
        return name;
    }

    public void addQuiz(int score){
        totalQuizScore += score;
        numQuizzes++;
    }

    public int getTotalScore(){
        return totalQuizScore;
    }

    public double getAverageScore(){
        double averageScore = totalQuizScore / numQuizzes;
        return averageScore;
    }
}
