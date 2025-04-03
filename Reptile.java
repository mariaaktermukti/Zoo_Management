public class Reptile extends Animal
{
    private String scaleColor;

    public Reptile(String name, int age, String gender, String habitat, String scaleColor)
    {
        super(name, age, gender, habitat);
        this.scaleColor = scaleColor;
    }

    public void eat()
    {
        System.out.println(getName() + " (" + getGender() + ", Scale Color: " + scaleColor + ") is eating.");
    }

    public void makeSound()
    {
        System.out.println(getName() + " makes a reptile sound.");
    }

    public void sleep()
    {
        System.out.println(getName() + " is sleeping.");
    }

    public void thermoregulation(int method)
    {
        System.out.println(getName() + " is thermoregulating in way " + method);
    }
}
