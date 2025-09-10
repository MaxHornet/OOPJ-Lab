public class Student {
    String name;
    int rollNo;
    int[] marks;

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'D';
    }

    void printResult() {
        System.out.println(name + " (Roll: " + rollNo + ")");
        System.out.println("Average: " + getAverage() + " | Grade: " + getGrade());
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78};
        Student s1 = new Student("Bishal", 101, marks);
        s1.printResult();
    }
}
