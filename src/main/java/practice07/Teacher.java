package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return klass != null ?
                String.format(super.introduce() +
                        " I am a Teacher. I teach Class %d.", this.klass.getNumber())
                : introduceWithNoClass();
    }

    private String introduceWithNoClass() {
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(klass != null && student.getKlass() == getKlass()){
            return String.format(super.introduce() +
                    " I am a Teacher. I teach %s.", student.getName());
        } else if(klass != null && student.getKlass() != getKlass()){
            return String.format(super.introduce() +
                    " I am a Teacher. I don't teach %s.", student.getName());
        }
        else{
            return introduceWithNoClass();
        }
    }
}
