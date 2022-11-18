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
        StringBuilder report = new StringBuilder((""));

        // Declaring Message Prompts
        String promptGreeting = """
                Select Student or Staff.
                """;

        String numErrorPrompt = "Please enter a positive number.";
        String stdntYearError = "Please enter a number between 1-4";
        String staffYearError = "Please enter a number between 1-70";
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
        // Initializing total, outgoing, and incoming
        double total = 00.00;
        double outgoing = 00.00;
        double incoming = 00.00;



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
                if(Student.validateStudentYear(userInput)){
                    student.setYear(userInput);
                    student.setFee(userInput);
                    incoming += student.getFee();
                } while(!Student.validateStudentYear(userInput)) {
                    JOptionPane.showMessageDialog(null,stdntYearError); // warning for year too big

                    // Prompting user to input Student Year again
                    userInput =
                            JOptionPane.showInputDialog(null, studentYearPrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                    student.setYear(userInput);
                    student.setFee(userInput);
                    incoming += student.getFee();
                }


                // Asking user to input student name
                userInput =
                        JOptionPane.showInputDialog(null, studentFNamePrompt,
                                secondTitle,JOptionPane.QUESTION_MESSAGE);

                // NAME VALIDATION
                if(Person.isValidName(userInput)){
                    student.setName(userInput);
                } while(!Person.isValidName(userInput)){
                    JOptionPane.showMessageDialog(null,nameErrorPrompt); // warning of name

                    // Prompt user to input Student name again
                    userInput =
                            JOptionPane.showInputDialog(null, studentFNamePrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                    student.setName(userInput);
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

                if(Person.isValidName(userInput)){
                    staff.setName(userInput);
                } while(!Person.isValidName(userInput)){
                    JOptionPane.showMessageDialog(null,nameErrorPrompt); // warning of name

                    // Prompt user to input Staff name again
                    userInput =
                            JOptionPane.showInputDialog(null, staffNamePrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                    staff.setName(userInput);
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
                if(Staff.validateStaffYear(userInput)){
                    staff.setYearOfService(userInput);
                    staff.setPay(userInput);
                    outgoing += staff.getPay();
                } while(!Staff.validateStaffYear(userInput)) {
                    JOptionPane.showMessageDialog(null,staffYearError); // warning for year too big

                    // Prompting user to input staff yearOfService again
                    userInput =
                            JOptionPane.showInputDialog(null, staffYearsPrompt,
                                    secondTitle,JOptionPane.QUESTION_MESSAGE);
                    staff.setYearOfService(userInput);
                    staff.setPay(userInput);
                    outgoing += staff.getPay();
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

        report.append("Students: [Total: " + students.size() + "]\n");
        for (Student currentStudent: students){
            report.append(currentStudent.toString(currentStudent));
            report.append("\n");
        }

        report.append("Staff: [Total: " + staffs.size() + "]\n");

        for (Staff currentStaff: staffs){
            report.append(currentStaff.toString(currentStaff));
            report.append("\n");
        }
        total = outgoing - incoming; // adding up total
        incoming = incoming/2; // dividing incoming by half

        report.append("\n \n \n");
        report.append("Outgoing: $" + outgoing +"\n" +
                "Incoming: $" +incoming + "\n" +
                "Total: $" + total);

        JOptionPane.showMessageDialog(null, report.toString(), "Report", JOptionPane.INFORMATION_MESSAGE);
    }




}