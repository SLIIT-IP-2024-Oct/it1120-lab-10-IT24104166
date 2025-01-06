import java.util.Scanner;

public class GradeValidator {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a mark between 0 and 100: ");
        int mark = scanner.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        String grade = "";
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        assert (isGradeCorrect(mark, grade)) : "Incorrect Grade Assigned";  
 
        System.out.println("Grade: " + grade);
        scanner.close();
    }

    private static boolean isGradeCorrect(int mark, String grade) {
        if (mark >= 75) {
            return grade.equals("A");
        } else if (mark >= 60) {
            return grade.equals("B");
        } else if (mark >= 50) {
            return grade.equals("C");
        } else if (mark >= 40) {
            return grade.equals("D");
        } else {
            return grade.equals("F");
        }
    }
}
