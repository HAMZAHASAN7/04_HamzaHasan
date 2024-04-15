package javaaaa;
class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class demo {
    public static void main(String[] args) {
      
        Person person1 = new Person("hamza", 20);
        Person person2 = new Person("harsh", 21);
        
     
        System.out.println("Person 1: Name - " + person1.name + ", Age - " + person1.age);
        System.out.println("Person 2: Name - " + person2.name + ", Age - " + person2.age);
    }
}
