public class Animal {

    public String name = "Kicky";
    private int age = 2;
    protected int weight = 3;
    String breed = "Unknown";

    @Override
    public String toString() {
        return "Animal\t " +
                "name: " + name +
                ", age: " + age +
                ", weight: " + weight +
                ", breed: " + breed;
    }
}
