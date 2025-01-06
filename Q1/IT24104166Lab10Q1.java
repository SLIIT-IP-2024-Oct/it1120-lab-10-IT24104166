import java.util.Scanner;

public class MarkValidator {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a mark between 0 and 100: ");
        int mark = scanner.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark"; 
        System.out.println("Mark is Validated");

        scanner.close();
    }
}
