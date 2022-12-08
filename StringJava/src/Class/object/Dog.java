
package Class.object;

public class Dog 
{

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + '}';
    }

    String name;   
    String breed;
    int age;
    String color;
    
    public Dog(String name, String breed, int age, String color) 
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}

