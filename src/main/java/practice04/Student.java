package practice04;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String basicIntroduce = super.introduce();
        return String.format(basicIntroduce + " I am a Student. I am at Class %d.", this.klass);
    }
}
