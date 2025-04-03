public class Bird extends Animal
{
    private double wingSpan;

    public Bird(String name, int age, String gender, String habitat, double wingSpan)
    {
        super(name, age, gender, habitat);
        this.wingSpan = wingSpan;
    }

    public void fly()
    {
        System.out.println(getName() + " is flying in the sky.");
    }

    public void eat()
    {
        System.out.println(getName() + " (" + getGender() + ", Wing Span: " + wingSpan + ") is eating.");
    }

    public void makeSound()
    {
        System.out.println(getName() + " makes a bird sound.");
    }

    public void sleep()
    {
        System.out.println(getName() + " is sleeping.");
    }

    public void sleep(int hours)
    {
        System.out.println(getName() + " is sleeping for " + hours + " hours.");
    }
}
