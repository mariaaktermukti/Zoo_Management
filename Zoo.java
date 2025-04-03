import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooKeeper
{
    private List<Animal> animals;
    private int animalCount;
    private static final int capacity = 9;

    public Zoo()
    {
        animals = new ArrayList<>();
        animalCount = 0;
    }

    public void addAnimal(Animal animal)
    {
        if (animalCount < capacity)
        {
            animals.add(animal);
            animalCount++;
        }
        else
        {
            System.out.println("Zoo capacity exceeded!");
        }
    }

    public void feedAnimal(Animal animal)
    {
        System.out.println("Zookeeper is feeding " + animal.getName());
        animal.eat();
        animal.makeSound();
    }

    public int getAnimalCount()
    {
        return animalCount;
    }

    public List<Animal> getAnimals()
    {
        return animals;
    }
}
