public class Person {

    //properties
    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }

    public static void main(String[] args) {
        //new object (alice)
        Person Alice = new Person("Alice", 25);

        //new object (bob)
        Person Bob = new Person("Bob", 30);

        System.out.println("Person 1:");
        System.out.println("Name: " + Alice.getName());
        System.out.println("Age: " + Alice.getAge());

        System.out.println("---------\nPerson 2:");
        System.out.println("Name: " + Bob.getName());
        System.out.println("Age: " + Bob.getAge());
    }
}