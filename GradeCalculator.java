import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator!");
        System.out.print("Enter the number of subjects: ");  // number of subject
        int numSubjects = input.nextInt();   // enter subject

        int totalMarks = 0;  // enter subject marks obtain

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " out of 100: ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= 90 ) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}







