class Animal
{
    String colour = "Brown";

    void eat()
    {
        System.out.println("Animal is eating");

    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");

    }
}

public class Main{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        System.out.println("colour: " + d.colour);
        d.eat();
        d.bark();
    }
}