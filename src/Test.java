public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "zhang";
        per.age = 12;
        per.sex = "男";
        per.showAge();
        per.study();
        per.addAge(2);
        per.showAge();
    }
}
