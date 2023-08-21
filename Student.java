package Q01;

public class Student implements Comparable<Student>{
    String studentName;
    int questionsSolved;

    public Student(String studentName, int questionsSolved) {
        this.studentName = studentName;
        this.questionsSolved = questionsSolved;
    }

    public int compareTo(Student failedStudent) {
        if (this.questionsSolved == failedStudent.questionsSolved) {
            return this.studentName.compareTo(failedStudent.studentName);
        } else {
            return Integer.compare(failedStudent.questionsSolved, this.questionsSolved);
        }
    }

}