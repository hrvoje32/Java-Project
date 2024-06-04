package Full_Code;
public class Lecturer extends Person{
    private int id;
    private int salary;
    private String course;
    //Constructor
    public Lecturer(int id,String name, char gender, String address, String phoneNumber, int age, String email, String course,int salary) {
        super(name, gender, address, phoneNumber, age, email);
        this.id = id;
        this.salary = salary;
        this.course = course;
    }
    //Setters and Getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    //Overridden method
    @Override
    public void displayPerson() {
        System.out.println("\n Lecturer ID: " + getId() +
                "\n Lecturer name: " + getName() +
                " \n Lecturer gender: " + getGender() +
                "\n Lecturer address: " + getAddress() +
                " \n Lecturer phone number: " + getPhoneNumber()+
                "\n Lecturer age: " + getAge() +
                "\n Lecturer email: " + getEmail() +
                "\n Lecturer course: " + getCourse() +
                "\n Lecturer salary: £" + getSalary());
    }
}

