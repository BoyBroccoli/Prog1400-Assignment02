import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a Person ArrayList for students and staff
        ArrayList<Person> people = new ArrayList<>();
        String userInput;
        int choice;
        boolean continueProgram = true;

        // Declaring Message Prompts
        String promptGreeting = """
                Select Student or Staff.
                """;

        String numErrorPrompt = "Please enter a number.";
        String nameErrorPrompt = "Please enter a valid name.";
        String title = "Accounting App";
        String secondTitle = "Input";
        String[] startButtonOptions = {"Student", "Staff", "Finish"};

        // Student Prompts
        String studentYearPrompt= "Enter student year(1-4)";
        String studentFNamePrompt = "Enter a Student Name";
        String studentAddrsPrompt = "Enter Student Address";

        // Staff Prmprts
        String staffNamePrompt = "Enter Staff Name";
        String staffAddrsPrompt = "Enter Staff Address";
        String staffYearsPrompt = "Enter staff years of service";


        // PROGRAM
        do{
            choice =
                    JOptionPane.showOptionDialog(null, promptGreeting,
                            title, JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null, startButtonOptions, startButtonOptions[0]);

            if (choice == 0){ // Student Selected
                Student student = new Student();

                // Asking user to input year
                userInput =
                        JOptionPane.showInputDialog(null, studentYearPrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);
                student.setYear(userInput);
                // Asking user to input student name
                userInput =
                        JOptionPane.showInputDialog(null, studentFNamePrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);
                student.setName(userInput);

                // Asking user to input staff address
                userInput =
                        JOptionPane.showInputDialog(null,studentAddrsPrompt,
                                secondTitle, JOptionPane.QUESTION_MESSAGE);

                student.setAddress(userInput);


            } else if (choice == 1) { // Staff Selected

                Staff staff = new Staff();

                // Asking user to input staff name
                userInput =
                        JOptionPane.showInputDialog(null, staffNamePrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);
                staff.setName(userInput);

                // Asking user to input staff address
                userInput =
                        JOptionPane.showInputDialog(null,staffAddrsPrompt,
                                secondTitle, JOptionPane.QUESTION_MESSAGE);

                staff.setAddress(userInput);

                // asking user to input staff years of service
                userInput =
                        JOptionPane.showInputDialog(null, staffYearsPrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);
                staff.setYearOfService(userInput);

            } else {
                // program finish
                continueProgram = false;
            }
        } while (continueProgram);


    }
}