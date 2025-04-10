public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Grading System");
        System.out.println("--------------------------------------------------");
        System.out.println("Please find the final grade and performance below: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        // Create an instance of the GradingSystem class with the name "Roger"
        // This initializes the student's name and sets up the grading system for Roger
        GradingSystem student = new GradingSystem("Roger");
        student.setPrelim(59.12);  // Example of Prelim grade
        student.setMidterm(33.68);  // Example of Midterm grade
        student.setPrefinal(94.50);  // Example of Prefinal grade
        student.setFinalExam(94.50);  // Example of Final Exam grade

        // Display the final result for the student, including the final grade and performance status
        student.displayResult();
    }
}