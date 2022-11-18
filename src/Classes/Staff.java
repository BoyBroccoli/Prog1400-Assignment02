package Classes;

public class Staff extends Person{

    private String yearOfService;
    private double pay;

    // Classes.Staff Constructor
    Staff(String name, String address, String yearOfService, double pay){
        super(name, address);
        this.yearOfService=yearOfService;
        this.pay=pay;
    }
    // Empty Classes.Staff Constructor
    public Staff(){}

    // Classes.Staff Getters
    public String getYearOfService(){
        return this.yearOfService;
    }

    public double getPay(){
        return this.pay;
    }
    // Classes.Staff Setters
    public void setYearOfService(String yearOfService){
        this.yearOfService=yearOfService;
    }

    public void setPay(String yearsOfService){
        double basePay = 50000.00;
        double increase = 500.00;
        int years = Integer.parseInt(yearsOfService);
        basePay += increase * years;
        this.pay=basePay;
    }

    // OVERRIDE METHODS
    public String toString(Staff currentStaff){

        return "name = " + super.getName() + ", address = " + super.getAddress() +
                ", years = " + currentStaff.getYearOfService() + ", pay = $" + currentStaff.getPay();
    }

    // Methods

    public static boolean validateStaffYear(String year){
        boolean validYear = false;
        if (Person.isAnInt(year)) {
            try {
                int staffYear;
                staffYear = Integer.parseInt(year);
                if (staffYear > 0 && staffYear <= 70) {
                    validYear = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return validYear;
    }
}
