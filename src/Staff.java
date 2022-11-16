public class Staff extends Person{

    private String yearOfService;
    private double pay;

    // Staff Constructor
    Staff(String fName, String lName, String stNum, String stName, String postalCode, String yearOfService, double pay){
        super(fName, lName, stNum, stName, postalCode);
        this.yearOfService=yearOfService;
        this.pay=pay;
    }
    // Empty Staff Constructor
    Staff(){};

    // Staff Getters
    public String getYearOfService(){
        return this.yearOfService;
    }

    public double getPay(){
        return this.pay;
    }
    // Staff Setters
    public void setYearOfService(String yearOfService){
        this.yearOfService=yearOfService;
    }

    public void setPay(double pay){
        this.pay=pay;
    }

    // OVERRIDE METHODS
    public String toString(Staff currentStaff){
        String info = "name = " + super.getName() + ", address = " + super.getAddress() +
                ", years = " + currentStaff.getYearOfService() + ", pay = " + currentStaff.getPay();

        return info;
    }
}
