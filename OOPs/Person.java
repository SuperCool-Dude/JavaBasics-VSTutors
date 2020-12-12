package OOPs;

import java.util.List;

public class Person {
    // Attributes
    String name;
    int age;
    String[] candy_list;

    // Constructor
    public Person(String user_name, int user_age) {
        this.name = user_name;
        this.age = user_age;
        this.candy_list = new String[2];
    }

    // Methods/Functions
    public void eat() {
        System.out.println(this.name + "is eating!");
        //Random stuff
    }

    public void createCandyList() {
        this.candy_list[0] = "Snickers";
        this.candy_list[1] = "M&Ms";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}