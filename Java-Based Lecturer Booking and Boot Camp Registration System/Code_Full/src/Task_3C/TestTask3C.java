package Task_3C;
import Full_Code.*;
import java.util.ArrayList;
import java.util.Scanner;
public class TestTask3C {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //creating course object
        Course bootcampFee = new Course();
        //Creating department object
        Department departments = new Department("Math", "Engineering", "Technology", "Science");
        //Creating object with no argument constructor
        ExternalStudent extStudent = new ExternalStudent();
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
        /*
        //Creating externalStudent object with dummy data
        ExternalStudent extStudent1 = new ExternalStudent("John Johnny", 'M', "London, E14 3Wg", "075373663", 30, "email@email.com");
        System.out.println(extStudent1.getName() + " Bootcamp price £"+bootcampFee.getBootcampFee()+" is now " + "£"+bootcampFee.getBootcampDiscount(true));
        */
     System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        boolean isStudent = false;
        for (Student student : students) {
            if (student.getName().toUpperCase().equals(name.toUpperCase())) {
                isStudent = true;
                break;
            }
        }
        System.out.println("Choose the department: ");
        departments.showDepartments();
        System.out.println("Type your answer: ");
        String department = scanner.nextLine();
        System.out.println("You have chosen: " + department.toUpperCase() + " department");
        if (department.equalsIgnoreCase("TECHNOLOGY")){
            System.out.println("Technology department offers additional bootcamp course which is £"+bootcampFee.getBootcampFee()+" Would you like to take it: Yes/No ");
            String further = scanner.nextLine();
            if(further.equalsIgnoreCase("yes") && !isStudent){
                System.out.println("Would you like to enrol on a full time course?Yes/No");
                String choice = scanner.nextLine();
                if(choice.equalsIgnoreCase("yes")){
                    System.out.println("Enter student's gender: ");
                    char gender = scanner.next().charAt(0);
                    scanner.nextLine();
                    System.out.println("Enter student's address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter student's phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter student's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student's email: ");
                    String email = scanner.nextLine();
                    extStudent = new ExternalStudent(name, gender, address, phoneNumber, age, email);
                    extStudent.displayPerson();
                    System.out.println("Total price of bootcamp with discount of 25% is:  £" + bootcampFee.getBootcampDiscount(true));
                }else if(choice.equalsIgnoreCase("no")){
                    System.out.println(name + " bootcamp price is : £" + bootcampFee.getBootcampFee());
                }
            } else if((further.equalsIgnoreCase("yes") && isStudent)) {
                System.out.println(name + " bootcamp price is : £" + bootcampFee.getBootcampDiscount(false));
            }
            else
                System.out.println(name + " I am sorry to hear that");
        }
    }
}


