class People {
    String name;
    int age;
    void speak(){
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }
    int getAge() {
        return age;
    }
String getName(){
        return name;
    }
}

public class Tutorial15{

    public static void main(String[] args) {
        People people1 = new People();

        people1.name = "Joe";
        people1.age = 25;

        // people1.speak();

        int years = people1.calculateYearsToRetirement();

        System.out.println("Years till retirement " + years);

        int age = people1.getAge();
        String name = people1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}