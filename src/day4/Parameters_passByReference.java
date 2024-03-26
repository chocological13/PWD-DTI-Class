public class Parameters_passByReference {

    // When you pass an object (or any reference type) to a method, Java passes the value of the reference to the object, not the object itself.
    static void changeObject(Person person) {
        person.setName("Jerry");
    }

    public static void main(String[] args) {
        Person person = new Person("Tom");
        changeObject(person);
        System.out.println(person.getName()); // Output Jerry
    }

static class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
}
