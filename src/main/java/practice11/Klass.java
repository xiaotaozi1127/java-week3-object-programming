package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass extends Observable {
    private int number;
    List<Student> students = new ArrayList<>();
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if(students.contains(student)){
            this.leader = student;
            setChanged();
            notifyObservers(String.format(" I know %s become Leader of %s.", student.getName(), getDisplayName()));
        }
        else{
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
        setChanged();
        notifyObservers(String.format(" I know %s has joined %s.", student.getName(), getDisplayName()));
    }
}
