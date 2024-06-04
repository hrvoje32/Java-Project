package Full_Code;
public class Student extends Person {
    private int id;
    private int fees;
    private String course;
    //Constructor
    public Student(int id,String name, char gender, String address, String phoneNumber, int age, String email, String course, int fees) {
        super(name, gender, address, phoneNumber, age, email);
        this.id = id;
        this.fees = fees;
        this.course = course;
    }
    //No arguments Constructor
    public Student(){
        super();
    }
    //Setters and Getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    //Overridden Method to show student's appointment details
    public void showAppointmentDetails(Appointment appointment, int appointmentTime) {
        System.out.println("---------------------------"+"\nAppointment Details: ");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + getName());
        System.out.println("Lecturer Name: " + appointment.getLecturer().getName());
        System.out.println("Date: " + appointment.getDate() +
                "\nAppointment Time: "+appointment.getHours()+":"+appointment.getMinutes()+" till "+
                appointment.getHours()+":"+appointment.add(appointment.getMinutes(),appointmentTime));
        System.out.println("---------------------------"+"\n Thank you.");

    }
    @Override
    public void displayPerson() {
        System.out.println("\n Student ID: " + getId() +
                "\n Student name: " + getName() +
                " \n Student gender: " + getGender() +
                "\n Student address: " + getAddress() +
                " \n Student phone number: " + getPhoneNumber()+
                "\n Student age: " + getAge() +
                "\n Student email: " + getEmail() +
                "\n Student course: " + getCourse() +
                "\n Student fees: £" + getFees());
    }
}

