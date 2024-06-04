package Task_3B;
import Full_Code.*;
import java.util.ArrayList;
import java.util.Scanner;
public class TestTask3B {
    public static void main(String[] args) {
        //Creating Array lists
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();
        //Creating Appointment system object
        AppointmentSystem appointmentSystem = new AppointmentSystem(appointments, students);
        //Creating student object
        Student st = new Student();
        //Creating students objects with constructor attributes
        Student Krista = new Student(15, "Krista Pierce", 'F', "14 Appletree Way, Owlsmoor,GU47 0UD", "56643567", 22, "email@email.com", "Technology", 5810);
        Student John = new Student(15, "John Johnny", 'F', "14 Appletree Way, Owlsmoor,GU47 0UD", "56643567", 22, "email@email.com", "Technology", 5810);
        //Adding dummy data students
        students.add(new Student(1, "Meredith Ramsey", 'M', "Pieces Of Eight, Lon St Ffraid, Trearddur Bay,LL65 2YS", "73748573839", 28, "email@email.com", "Computing", 9250));
        students.add(new Student(2, "Muhammad Lam", 'M', "16 Shawhurst Croft, Hollywood,B47 5PB", "3648837484", 22, "email@email.com", "Science", 6820));
        students.add(new Student(3, "Braylon Levine", 'M', "1 Pickwick Close, Durham,DH1 3QU", "38474754", 23, "email@email.com", "Engineering", 7353));
        students.add(new Student(4, "Taniya Fuller", 'F', "2 Brook Cottages, Garrigill,CA9 3EA", "878787334", 26, "email@email.com", "Technology", 8230));
        students.add(new Student(5, "Braiden Meadows", 'M', "130 Jefferstone Lane, St Marys Bay,TN29 0SG", "35544555", 30, "email@email.com", "Computing", 9000));
        students.add(new Student(6, "Edwin Kent", 'M', "4 Barwell Close, Stockport,SK5 6YF", "45555666", 28, "email@email.com", "Technology", 5670));
        students.add(new Student(7, "Rylie Morris", 'M', "Dog Bank, Foxfield,LA20 6BU", "034555733", 18, "email@email.com", "Science", 8760));
        students.add(new Student(8, "Zane Cameron", 'M', "2 Downs Mill, Farley,TF13 6PE", "94784555", 23, "email@email.com", "Engineering", 9010));
        students.add(new Student(9, "Dane Mcpherson", 'M', "16 Dingle Road, Bournemouth,BH5 2DR", "098837834", 26, "email@email.com", "Computing", 4630));
        students.add(new Student(10, "Karen Rivas", 'F', "2 Pitman Lane, Cardiff,CF11 9ED", "8675446665", 24, "email@email.com", "Science", 6600));
        students.add(new Student(11, "Andreas Payne", 'M', "2 Beecher Drive, Wakefield,WF1 4FN", "06755432", 24, "email@email.com", "Technology", 5800));
        students.add(new Student(12, "Tyree Hayden", 'M', "125 Main Road, Bilton,HU11 4AB", "5565425", 29, "email@email.com", "Engineering", 7200));
        students.add(new Student(13, "Dayana Hebert", 'F', "3 Brockton Close, Romford,RM1 4EQ", "057754326", 32, "email@email.com", "Science", 8000));
        students.add(new Student(14, "Kyler Lynn", 'M', "117 Pickford Hill, Harpenden,AL5 5HJ", "66557822", 25, "email@email.com", "Computing", 6000));
        //Adding,removing,modifying and deleting students
        students.add(Krista);
        students.add(John);
        students.set(14,new Student(15,"Krista Krista",'M',"14 London Road E14 3WQ","087367234",20,"krista@gmail.com","Science",9200));
        students.remove(John);

        //Adding dummy data lecturers
        lecturers.add(new Lecturer(1, "Miya Krause", 'F', "Covean Little House, St Agnes,TR22 0PL", "567682", 32, "email@email.com", "Science", 2500));
        lecturers.add(new Lecturer(2, "Emilie Cuevas", 'F', "9 Tradescant Drive, Meopham,DA13 0EL", "78545737", 35, "email@email.com", "Technology", 2200));
        lecturers.add(new Lecturer(3, "Ximena Bradley", 'F', "3 Fenwicks Lane, Fulford,YO10 4PL", "66755554", 33, "email@email.com", "Engineering", 3000));
        lecturers.add(new Lecturer(4, "Zayne Cross", 'F', "20 Back Lane, Farsley,LS28 5EU", "665427775", 38, "email@email.com", "Science", 2800));
        lecturers.add(new Lecturer(5, "Koen Farley", 'M', "5 Kent Road, Stockport,SK3 0JD", "74366655", 40, "email@email.com", "Computing", 3200));
        //Adding dummy data appointments
        appointments.add(new Appointment(1, "03-03-2023", 10, 10, lecturers.get(0)));
        appointments.add(new Appointment(2, "06-03-2023", 16, 20, lecturers.get(1)));
        appointments.add(new Appointment(3, "01-04-2023", 12, 30, lecturers.get(2)));
        appointments.add(new Appointment(4, "09-07-2023", 11, 45, lecturers.get(3)));

        //Show students from array list
        appointmentSystem.showStudents();

        //Declare scanner
        Scanner sc = new Scanner(System.in);
        //asking student about appointment, displaying available appointments, and passing inputted values to the showappointmentDetails
        System.out.print("Enter student ID: ");
        int studentIndex = sc.nextInt()-1;
        appointmentSystem.showAppointments(appointments);
        System.out.print("Enter appointment ID: ");
        int appointmentIndex = sc.nextInt()-1;
        System.out.print("Enter appointment time in minutes: ");
        int appointmentTime = sc.nextInt();
        if(appointmentTime > 15){
            System.out.println("Appointment unavailable, you are only allowed to book 15 min slot");


        } else {
            appointmentSystem.showAppointmentDetails(studentIndex, appointmentIndex, appointmentTime);
        }



    }


}

