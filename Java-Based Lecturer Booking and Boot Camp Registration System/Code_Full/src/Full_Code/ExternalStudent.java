package Full_Code;
public class ExternalStudent extends Person {


    //Constructor
    public ExternalStudent(String name, char gender, String address, String phoneNumber, int age, String email){
        super(name, gender, address, phoneNumber, age, email);

    }
    //No argument constructor
    public ExternalStudent(){
        super();
    }

    @Override
    public void displayPerson() {
        System.out.println(
                "\n External student name: " + getName() +
                        " \n External student gender: " + getGender() +
                        "\n External student address: " + getAddress() +
                        " \n External student phone number: " + getPhoneNumber()+
                        "\n External student age: " + getAge() +
                        "\n External student email: " + getEmail());

    }
}
