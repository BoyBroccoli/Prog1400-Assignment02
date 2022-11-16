public class Student extends Person{
    private String year;

    // Student Constructor
    Student(String fName, String lName, String stNum, String stName, String postalCode, String year){
        super(fName, lName, stNum, stName, postalCode);
        this.year=year;
    }
    // Empty Student Constructor

    Student(){};

    // Student Getters
    public String getYear(){
        return this.year;
    }

    // Student Setters

    public void setYear(String year){
        this.year=year;
    }

}
