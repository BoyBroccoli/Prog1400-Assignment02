public abstract class Person {

    // INSTANCE VARIABLES

    private String name;
    private String fName;
    private String lName;
    private String address;
    private String stNum;
    private String stName;
    private String postalCode;


    // CONSTRUCTORS
    Person(String fName, String lName, String stNum, String stName, String postalCode){
        this.fName=fName;
        this.lName=lName;
        this.stNum=stNum;
        this.stName=stName;
        this.postalCode=postalCode;
        this.name= fName + " " + lName;
        this.address= stNum + " " + stName + ", " + postalCode;
    }

    Person(){}; // blank constructor



    // GETTERS

    public String getName(){
        return this.name;
    };

    public String getfName(){
        return this.fName;
    }

    public String getlName(){
        return this.lName;
    }

    public String getAddress(){
        return this.address;
    }

    public String getStNum(){
        return this.stNum;
    }

    public String getStName(){
        return this.stName;
    }

    public String getPostalCode(){
        return this.postalCode;
    }

    // SETTERS

    public void setName(String name){
        this.name= name;
    }

    public void setNameTwo(String fname, String lname){
        this.name = fname + " " + lname;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public void setLName(String lName){
        this.lName = lName;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setAddress2(String stNum, String stName, String postalCode){
        this.address = this.stNum + " " + this.stName + ", " + this.postalCode;
    }

    public void setStNum(String stNum){
        this.stNum = stNum;
    }

    public void setStName(String stName){
        this.stName = stName;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

   // public abstract String toString(Person person);

}
