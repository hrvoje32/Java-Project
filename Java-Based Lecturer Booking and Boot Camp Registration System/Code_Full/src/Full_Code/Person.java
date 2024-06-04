package Full_Code;
abstract class Person{
    private String name;
    private char gender;
    private String address;
    private String phoneNumber;
    private int age;
    private String email;
    //Constructor
    public Person(String name, char gender, String address, String phoneNumber, int age, String email){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;

    }
    //No argument constructor
    public Person() {
    }
    //Setters and Getters Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //Method display Person
    public abstract void displayPerson();
}

