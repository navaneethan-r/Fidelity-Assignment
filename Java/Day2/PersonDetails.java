class Person {
    private String name;
    public String gender;
    public int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person person = new Person("Navaneethan", "Male", 22);
        person.displayDetails();
    }
}
