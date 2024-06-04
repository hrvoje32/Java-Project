package Task_3A;
import Full_Code.*;
public class TestTask3A {
    public static void main(String[] args) {


        //Creating Student object
        Student st = new Student(1, "Johnny Depp", 'M', "London 26 Marsh Wall, E14 1RE", "823747234", 25, "john@email.com", "Science", 900);

        //Creating External student object
        ExternalStudent extSt = new ExternalStudent("Christian Ramsey", 'M', "London W1 3CW, London Street", "07483823", 28, "christian@email.com");

        //Creating Lecturer object
        Lecturer lect = new Lecturer(2, "Laura Benetton", 'F', "Manchester 30 London Road", "087638473", 35, "laura@email.com", "Technology", 2500);


        //Testing derived classes
        System.out.println("Student: ");
        st.displayPerson();
        System.out.println("-----------------------------------------------------------");
        System.out.println("External student: ");
        extSt.displayPerson();
        System.out.println("---------------------------------------------------------- ");
        System.out.println("Lecturer: ");
        lect.displayPerson();

    }
}
