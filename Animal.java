public abstract class Animal
{
    private String name;
    private int age;
    private String gender;
    private String habitat;

    public Animal(String name, int age, String gender, String habitat)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getHabitat()
    {
        return habitat;
    }

    public abstract void eat();
    public abstract void makeSound();
    public abstract void sleep();
}
