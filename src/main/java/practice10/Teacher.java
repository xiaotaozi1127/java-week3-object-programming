package practice10;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private HashSet<Klass> klasses = new HashSet<>();

    public Teacher(int id, String name, int age, HashSet<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public HashSet<Klass> getClasses() {
        return klasses;
    }

    @Override
    public String introduce() {
        String ownedClasses = klasses.stream()
                .sorted((o1, o2) -> o1.getNumber() > o2.getNumber() ? 1 : -1)
                .map(k -> new Integer(k.getNumber()).toString())
                .collect(Collectors.joining(", "));

        if(klasses.size() > 0){
            return super.introduce() + " I am a Teacher. I teach Class " + ownedClasses + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().filter(k -> k.getNumber() == student.getKlass().getNumber())
                .collect(Collectors.toList()).size() > 0;
    }

    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }
}
