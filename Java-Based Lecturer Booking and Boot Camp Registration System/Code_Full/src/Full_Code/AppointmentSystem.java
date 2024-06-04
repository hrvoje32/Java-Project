package Full_Code;

import java.util.ArrayList;
//Constructor
public class AppointmentSystem {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();
    //Constructor
    public AppointmentSystem(ArrayList<Appointment> appointments, ArrayList<Student> students) {
        this.appointments = appointments;
        this.students = students;
    }
    //Method to show students from array list
   public void showStudents() {
        System.out.println("Students: ");
        for (Student student : students) {
            student.displayPerson();
        }
    }
    //Method to display appointment from array lists
    public void showAppointments(ArrayList<Appointment> appointments) {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
    //Method to get appointment based on appointment index in the array list
    public Appointment getAppointment(int index) {
        if (index >= 0 && index < students.size()) {
            return appointments.get(index);
        }
        return null
                ;
    }
    //Method to get student based on student index in the array list
    public Student getStudent(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }
    //Method to show complete appointment booking
    public void showAppointmentDetails(int studentIndex, int appointmentIndex, int appointmentTime) {
        Student student = getStudent(studentIndex);
        Appointment appointment =  getAppointment(appointmentIndex);
        if (student != null && appointment != null) {
            student.showAppointmentDetails(appointment, appointmentTime);
        }
    }
}





