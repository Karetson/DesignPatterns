import java.util.Objects;

public abstract class Animal {
    public String name;
    public int age;
    public String color;

    public Animal () {

    }

    public Animal(Animal target) {
        if (target != null) {
            this.name = target.name;
            this.age = target.age;
            this.color = target.color;
        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) {
            return false;
        }

        Animal animal = (Animal) obj;
        return animal.name == name && animal.age == age && Objects.equals(animal.color, color);
    }
}
