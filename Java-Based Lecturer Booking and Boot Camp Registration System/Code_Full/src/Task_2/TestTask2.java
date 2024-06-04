package Task_2;
import Full_Code.*;

public class TestTask2 {
    public static void main(String[] args) {
        //Creating student object
        Student testStudent = new Student(12, "Lenny Dep", 'M', "London ECW1", "0863467636", 25, "lenny@email.com", "Computing", 9000);

        //Creating appointment object
        Appointment appointmentTest = new Appointment();
        appointmentTest.setDate("13.01.2022");
        appointmentTest.setId(1);
        appointmentTest.setHours(10);
        appointmentTest.setMinutes(30);

        //Creating course object
        Course testCourse = new Course();

        //Creating department object
        Department testDepartment = new Department("Math","Engineering","Technology","Science");

        //Print Student as abstract class Person cannot be declared
        testStudent.displayPerson();
        System.out.println("------------------------------------");
        //Print appointment
        System.out.println("Appointment ID:"+ appointmentTest.getId() + "\nAppointment date: "+ appointmentTest.getDate()+
                "\nhours: "+appointmentTest.getHours()+"\nminutes:"+appointmentTest.getMinutes());
        System.out.println("------------------------------------");
        //Print course
        System.out.println("Course fees: "+testCourse.getBootcampFee());
        System.out.println("------------------------------------");
        //Print Department
        testDepartment.showDepartments();


    }

}
