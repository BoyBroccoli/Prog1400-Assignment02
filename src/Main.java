import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a Person ArrayList for students and staff
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();
        String userInput;
        int choice;
        boolean continueProgram = true;
        StringBuilder studdentReport = new StringBuilder("Student Results: \n \n");
        StringBuilder staffReport = new StringBuilder("Staff Results: \n \n");

        // Declaring Message Prompts
        String promptGreeting = """
                Select Student or Staff.
                """;

        String numErrorPrompt = "Please enter a positive number.";
        String stdntYearError = "Please enter a number between 1-4";
        String staffYearError = "Please enter a number between 1-100";
        String nameErrorPrompt = "Please enter a valid name. No numbers, Commas, or Special Characters.";
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

                // YEAR VALIDATION
                if(validateStudentYear(userInput)){
                    student.setYear(userInput);
                } while(!validateStudentYear(userInput)) {
                    JOptionPane.showMessageDialog(null,stdntYearError); // warning for year too big

                    // Prompting user to input Student Year again
                    userInput =
                            JOptionPane.showInputDialog(null, studentYearPrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                }


                // Asking user to input student name
                userInput =
                        JOptionPane.showInputDialog(null, studentFNamePrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);

                // NAME VALIDATION
                if(isValidName(userInput)){
                    student.setName(userInput);
                } while(!isValidName(userInput)){
                    JOptionPane.showMessageDialog(null,nameErrorPrompt); // warning of name

                    // Prompt user to input Student name again
                    userInput =
                            JOptionPane.showInputDialog(null, studentFNamePrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                }


                // Asking user to input student address
                userInput =
                        JOptionPane.showInputDialog(null,studentAddrsPrompt,
                                secondTitle, JOptionPane.QUESTION_MESSAGE);

                student.setAddress(userInput);

                // adding student to person arrayList
                students.add(student);


            } else if (choice == 1) { // Staff Selected

                Staff staff = new Staff();

                // Asking user to input staff name
                userInput =
                        JOptionPane.showInputDialog(null, staffNamePrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);

                // VALIDATE STAFF NAME

                if(isValidName(userInput)){
                    staff.setName(userInput);
                } while(!isValidName(userInput)){
                    JOptionPane.showMessageDialog(null,nameErrorPrompt); // warning of name

                    // Prompt user to input Staff name again
                    userInput =
                            JOptionPane.showInputDialog(null, staffNamePrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                }


                // Asking user to input staff address
                userInput =
                        JOptionPane.showInputDialog(null,staffAddrsPrompt,
                                secondTitle, JOptionPane.QUESTION_MESSAGE);

                staff.setAddress(userInput);

                // asking user to input staff years of service
                userInput =
                        JOptionPane.showInputDialog(null, staffYearsPrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);

                // YEAR VALIDATION
                if(validateStaffYear(userInput)){
                    staff.setYearOfService(userInput);
                } while(!validateStaffYear(userInput)) {
                    JOptionPane.showMessageDialog(null,staffYearError); // warning for year too big

                    // Prompting user to input staff yearOfService again
                    userInput =
                            JOptionPane.showInputDialog(null, staffYearsPrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                }


                // adding staff to people arrayList
                staffs.add(staff);

            } else if (choice == 2){ // If user selects Finish
                continueProgram = false;
            }else {
                // program finish
                continueProgram = false;
            }
        } while (continueProgram);


        for (Student currentStudent: students){
            studdentReport.append(currentStudent.toString(currentStudent));
        }

        for (Staff currentStaff: staffs){
            staffReport.append(currentStaff.toString(currentStaff));
        }

        JOptionPane.showMessageDialog(null, staffReport.toString(), secondTitle, JOptionPane.INFORMATION_MESSAGE);
    }



    // METHODS
    public static boolean isAnInt(String year){
        String regex = "[-?\\d+]";
        return year.matches(regex);
    }

    public static boolean validateStudentYear(String year){
        boolean validYear = false;
        if (isAnInt(year)) {
            try {
                int studentYear;
                studentYear = Integer.parseInt(year);
                if (studentYear > 0 && studentYear <= 4) {
                    validYear = true;
                } else {
                    validYear = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return validYear;
    }

    public static boolean validateStaffYear(String year){
        boolean validYear = false;
        if (isAnInt(year)) {
            try {
                int staffYear;
                staffYear = Integer.parseInt(year);
                if (staffYear > 0 && staffYear <= 100) {
                    validYear = true;
                } else {
                    validYear = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return validYear;
    }

    public static boolean isValidName(String input){
        String regex = "^[\\p{L}\\s.'’\\-]+$"; // match any name with any letter and spaces no special characters or '
        return input.matches(regex);
    }
}