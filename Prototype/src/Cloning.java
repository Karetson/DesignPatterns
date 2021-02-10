import java.util.ArrayList;
import java.util.List;

public class Cloning {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Animal> animalsCopy = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.name = "Filemon";
        cat1.age = 4;
        cat1.color = "grey";
        cat1.tail = "very long";
        animals.add(cat1);

        Cat cat2 = (Cat) cat1.clone();
        animals.add(cat2);

        Parrot parrot = new Parrot();
        parrot.name = "Ara";
        parrot.age = 2;
        parrot.color = "blue";
        parrot.wings = "strong";
        animals.add(parrot);

        cloneAndCompare(animals, animalsCopy);
    }

    private static void cloneAndCompare(List<Animal> animals, List<Animal> animalsCopy) {
        for (Animal animal : animals) {
            animalsCopy.add(animal.clone());
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) != animalsCopy.get(i)) {
                System.out.println(i + ": Animals are different objects!");
                if (animals.get(i).equals(animalsCopy.get(i))) {
                    System.out.println(i + ": They are both animals!");
                } else {
                    System.out.println(i + ": Both of them are not animals");
                }
            } else {
                System.out.println(i + ": Animal objects are the same!");
            }
        }
    }
}
