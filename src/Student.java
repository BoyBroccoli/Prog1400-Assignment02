public class Student extends Person{
    private String year;


    private double fee;

    // Student Constructor
    Student(String fName, String lName, String stNum, String stName, String postalCode, String year, double fee){
        super(fName, lName, stNum, stName, postalCode);
        this.year=year;
        this.fee=fee;
    }
    // Empty Student Constructor

    Student(){};

    // Student Getters
    public String getYear(){
        return this.year;
    }

    public double getFee() {
        return this.fee;
    }

    // Student Setters

    public void setYear(String year){
        this.year=year;
    }


    // OVERRIDE METHODS
    public String toString(Student currentStudent){
        String info = "name = " + super.getName() + ", address = " + super.getAddress() +
                ", year = " + currentStudent.getYear() + ", fee = " + currentStudent.getFee();

        return info;
    }

}
