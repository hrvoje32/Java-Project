package Full_Code;
    //No argument constructor
    public class Appointment {
        private String date;
        private int id;
        private int hours;
        private int minutes;
        private Lecturer lecturer;
        //Constructor
        public Appointment(int id,String date, int hours, int minutes, Lecturer lecturer) {
            this.id = id;
            this.date = date;
            this.hours = hours;
            this.minutes = minutes;
            this.lecturer = lecturer;
        }
        //No argument constructor
        public Appointment(){

        }
        //Method to calculate minutes
        public int add(int a, int minutes){
            int sum = a + minutes;
            return sum;
        }
        //Setters and Getters
        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setId(int id) {
            this.id = id;
        }
        public String getDate() {
            return date;
        }

        public int getId(){
            return id;
        }
        public Lecturer getLecturer() {
            return lecturer;
        }
        //Method to print appointment with the lecturer name
        @Override
        public String toString() {
            return getId()+" "+"Date: " + date + " Time: " + hours+":"+minutes + " Lecturer: " + lecturer.getName();
        }

    }