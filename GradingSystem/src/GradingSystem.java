public class GradingSystem {
    private double prelim;        // Store the grade for the preliminary exam
    private double midterm;       // Store the grade for the midterm exam
    private double prefinal;      // Store the grade for the prefinal exam
    private double finalExam;     // Store the grade for the final exam
    private String name;          // Store the student's name

    // Constructor to initialize the student's name
    // This constructor is called when a new GradingSystem object is created
    // It initializes the student's name
    public GradingSystem(String name) {
        this.name = name;  // Assign the provided name to the student's name field
    }

    // Methods to set the grades for each exam. These allow us to set the scores
    // for prelim, midterm, prefinal, and final exam.

    // Set the grade for the preliminary exam
    public void setPrelim(double prelim) {
        this.prelim = prelim;  // Assign the provided prelim grade to the object's prelim field
    }

    // Set the grade for the midterm exam
    public void setMidterm(double midterm) {
        this.midterm = midterm;  // Assign the provided midterm grade to the object's midterm field
    }

    // Set the grade for the prefinal exam
    public void setPrefinal(double prefinal) {
        this.prefinal = prefinal;  // Assign the provided prefinal grade to the object's prefinal field
    }

    // Set the grade for the final exam
    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;  // Assign the provided final exam grade to the object's finalExam field
    }

    // Calculate the student's final grade based on weighted percentages for each exam
    // The final grade is calculated using the formula:
    // - Prelim = 20%
    // - Midterm = 20%
    // - Prefinal = 20%
    // - Final Exam = 40%
    public double calculateFinalGrade() {
        // Return the calculated final grade by applying the weights to each exam grade
        return (prelim * 0.20) + (midterm * 0.20) + (prefinal * 0.20) + (finalExam * 0.40);
    }

    // Determine the student's performance status based on the final grade
    // It uses the final grade to categorize the student's performance as:
    // - Very Good (90 or higher)
    // - Good (75-89)
    // - Passing (50-74)
    // - Failing (below 50)
    public String performanceStatus() {
        double finalGrade = calculateFinalGrade(); // Calculate the final grade
        // Return a performance status based on the final grade
        if (finalGrade >= 90) {
            return "Very Good";   // Return "Very Good" for grades 90 and above
        } else if (finalGrade >= 75) {
            return "Good";        // Return "Good" for grades between 75 and 89
        } else if (finalGrade >= 50) {
            return "Passing";     // Return "Passing" for grades between 50 and 74
        } else {
            return "Failing";     // Return "Failing" for grades below 50
        }
    }

    // Display the result of the student's final grade and performance status
    public void displayResult() {
        double finalGrade = calculateFinalGrade();  // Calculate the student's final grade
        System.out.println(name + "'s Final Grade: " + finalGrade);  // Display the student's final grade

        // Based on the final grade, print if the student passed or failed
        if (finalGrade >= 50) {
            System.out.println(name + " has passed.");  // If the final grade is 50 or higher, the student passed
        } else {
            System.out.println(name + " has failed.");  // If the final grade is below 50, the student failed
        }

        // Display the student's performance status (Very Good, Good, Passing, Failing)
        System.out.println(name + " is " + performanceStatus() + ".");
    }
}
