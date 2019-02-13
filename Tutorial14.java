class Persons {
    // Instance variables (data or "state")
    String name;
    int age;

    //classes can contain
    // 1. Data
    // 2. Subroutines (methods)
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}

    public class Tutorial14 {
        public static void main(String[] args) {

            // Create a Person object using the Person class
            Persons persons1 = new Persons();
            persons1.name = "Joe Bloggs";
            persons1.age = 37;
            persons1.speak();
            persons1.sayHello();

            // Create a second Person object
            Persons persons2 = new Persons();
            persons2.name = "Sarah Smith";
            persons2.age = 20;
            persons2.speak();
            persons2.sayHello();

        }
    }

