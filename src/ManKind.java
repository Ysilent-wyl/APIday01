public class ManKind {
    public int sex;
    public int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSex() {
        return sex;
    }
    public void manOrWoman(){
        if(this.sex == 1){
            System.out.println("man");
        }else {
            System.out.println("woman");
        }
    }
    public void employed(){
        if(this.salary == 0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }
}
