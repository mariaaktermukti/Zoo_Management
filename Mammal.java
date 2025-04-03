public class Mammal extends Animal
{
    private String furType;

    public Mammal(String name, int age, String gender, String habitat, String furType)
    {
        super(name, age, gender, habitat);
        this.furType = furType;
    }

    public void nurseYoung()
    {
        System.out.println(getName() + " is taking care of its young.");
    }

    public void eat()
    {
        System.out.println(getName() + " (" + getGender() + ", Fur Color: " + furType + ") is eating.");
    }

    public void makeSound()
    {
        System.out.println(getName() + " makes a mammal sound.");
    }

    public void sleep()
    {
        System.out.println(getName() + " is sleeping.");
    }
}
