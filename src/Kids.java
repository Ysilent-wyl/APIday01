public class Kids extends ManKind{
    public int yearsold;
    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }
    public int getYearsold() {
        return yearsold;
    }
    public void printAge(){
        System.out.println(this.yearsold);
    }

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setYearsold(2);
        someKid.printAge();
        someKid.salary = 0;
        someKid.sex = 1;
        someKid.employed();
        someKid.manOrWoman();
    }
}
