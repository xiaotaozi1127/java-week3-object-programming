package practice06;

public class Teacher extends Person {
    private int klass;
    private boolean hasClass = false;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
        hasClass = true;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if(hasClass){
            return String.format(super.introduce() + " I am a Teacher. I teach Class %d.", this.klass);
        }else{
            return String.format(super.introduce() + " I am a Teacher. I teach No Class.");
        }
    }
}
