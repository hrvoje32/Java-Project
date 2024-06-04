package Full_Code;
public class Course implements BootcampDiscount {
    private int bootcampFee;
    //No argument constructor
    public Course(){
    }
    //Setters and Getters
    public void setBootcampFee(int bootcampFee){
        this.bootcampFee = bootcampFee;
    }
    public int getBootcampFee(){
        return 500;
    }
    //Method to display bootcamp fees based on student
    @Override
    public int getBootcampDiscount(boolean isExternalStudent) {
        if (isExternalStudent) {
            return getBootcampFee() - (getBootcampFee() * 25 / 100);
        } else {
            return getBootcampFee();
        }
    }
}
