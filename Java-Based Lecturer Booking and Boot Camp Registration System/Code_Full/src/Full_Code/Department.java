package Full_Code;
public class Department{
    private String math;
    private String engineering;
    private String technology;
    private String science;
    //Constructor
    public Department(String math, String engineering, String technology, String science){
        this.math = math;
        this.engineering = engineering;
        this.technology = technology;
        this.science = science;

    }
    //Setters and Getters
    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEngineering() {
        return engineering;
    }

    public void setEngineering(String engineering) {
        this.engineering = engineering;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }
    //Method to display departments
    public  void showDepartments(){
        System.out.println(" 1. "+ getMath()+"\n 2. "+getScience()+"\n 3. "+getEngineering()+"\n 4. "+getTechnology());
    }
}
