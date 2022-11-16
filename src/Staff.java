public class Staff extends Person{

    private String yearOfService;

    // Staff Constructor
    Staff(String fName, String lName, String stNum, String stName, String postalCode, String yearOfService){
        super(fName, lName, stNum, stName, postalCode);
        this.yearOfService=yearOfService;
    }
    // Empty Staff Constructor
    Staff(){};

    // Staff Getters
    public String getYearOfService(){
        return this.yearOfService;
    }
    // Staff Setters
    public void setYearOfService(String yearOfService){
        this.yearOfService=yearOfService;
    }
}
