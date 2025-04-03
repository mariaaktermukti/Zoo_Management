public class Main
{
    public static void main(String[] args)
    {
        Zoo zoo = new Zoo();
        Mammal lion = new Mammal("Lion", 5, "Male", "Savannah", "Golden");
        Mammal elephant = new Mammal("Elephant", 10, "Female", "Jungle", "Gray");
        Mammal giraffe = new Mammal("Giraffe", 7, "Male", "Savannah", "Spotted");

        Bird eagle = new Bird("Eagle", 3, "Female", "Mountains", 2.0);
        Bird parrot = new Bird("Parrot", 2, "Male", "Tropical", 0.5);
        Bird penguin = new Bird("Penguin", 4, "Female", "Antarctic", 1.0);

        Reptile snake = new Reptile("Snake", 6, "Female", "Rainforest", "Green");
        Reptile crocodile = new Reptile("Crocodile", 12, "Male", "Swamp", "Brown");
        Reptile turtle = new Reptile("Turtle", 15, "Female", "Beach", "Brown");

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(eagle);
        zoo.addAnimal(parrot);
        zoo.addAnimal(penguin);
        zoo.addAnimal(snake);
        zoo.addAnimal(crocodile);
        zoo.addAnimal(turtle);

        for (Animal animal : zoo.getAnimals())
        {
            zoo.feedAnimal(animal);
            if (animal instanceof Bird)
            {
                if (animal.getName().equals("Eagle"))
                {
                    ((Bird) animal).sleep(6);
                }
                else if (animal.getName().equals("Parrot"))
                {
                    ((Bird) animal).sleep(8);
                }
                else if (animal.getName().equals("Penguin"))
                {
                    ((Bird) animal).sleep(10);
                }
            }
            else if (animal instanceof Reptile)
            {
                if (animal.getName().equals("Snake"))
                {
                    ((Reptile) animal).thermoregulation(1);
                }
                else if (animal.getName().equals("Crocodile"))
                {
                    ((Reptile) animal).thermoregulation(2);
                }
                else if (animal.getName().equals("Turtle"))
                {
                    ((Reptile) animal).thermoregulation(3);
                }
            }
        }
        zoo.addAnimal(new Mammal("Overflow Animal", 1, "Male", "Unknown", "None"));
    }
}
