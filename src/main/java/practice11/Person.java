package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Person){
            return id == ((Person) obj).id;
        }
        return false;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }
}
