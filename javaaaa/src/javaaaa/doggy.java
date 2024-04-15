package javaaaa;

class Dog {
    String name;
    String breed;
    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

public class doggy{
    public static void main(String[] args) {
      
        
         Dog d1=new Dog("german","xyz");
         Dog d2=new Dog("spa","yzx");
        System.out.println("doggy 1: Name - " + d1.name + ",breed"+d1.breed);
        System.out.println("doggy 2: Name - " + d2.name + ",breed"+d2.breed);
    }
}
