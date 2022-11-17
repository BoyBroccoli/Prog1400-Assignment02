public abstract class Person {

    // INSTANCE VARIABLES

    private String name;
    private String address;


    // CONSTRUCTORS
    Person(String name, String address){
        this.name= name;
        this.address= address;
    }

    Person(){}; // blank constructor


    // GETTERS

    public String getName(){
        return this.name;
    };

    public String getAddress(){
        return this.address;
    }

    // SETTERS

    public void setName(String name){
        this.name= name;
    }


    public void setAddress(String address){
        this.address=address;
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

    public static boolean isValidName(String input){
        String regex = "^[\\p{L}\\s.'’\\-]+$"; // match any name with any letter and spaces no special characters or '
        return input.matches(regex);
    }

    public static boolean isAnInt(String year){
        String regex = "[-?\\d+]"; // match any number no matter the length
        return year.matches(regex);
    }

   // public abstract String toString(Person person);

}
