public class Student extends Person{
    private String year;


    private double fee;

    // Student Constructor
    Student(String name, String address, String year, double fee){
        super(name, address);
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

    public void setFee(String year){
        double num;
        num = Integer.parseInt(year);
        if (num == 1) {
            this.fee = 3000.00;
        } else if (num == 2){
            this.fee = 3100.00;
        } else if (num == 3){
            this.fee = 3200.00;
        } else {
            this.fee = 3300.00;
        }
    }

    // OVERRIDE METHODS
    public String toString(Student currentStudent){
        String info = "name = " + super.getName() + ", address = " + super.getAddress() +
                ", year = " + currentStudent.getYear() + ", fee = $" + currentStudent.getFee();

        return info;
    }

}
