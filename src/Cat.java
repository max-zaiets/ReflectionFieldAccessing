import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Animal> classAnimal = Animal.class;
        Animal animal = new Animal();
        System.out.println("Початкові значення полів \n" + animal);

        Field field = classAnimal.getField("name");              // зміна public поля
        field.set(animal, "Devil");

        field = classAnimal.getDeclaredField("age");             // зміна private поля
        field.setAccessible(true);
        field.set(animal, 11);


        field = classAnimal.getDeclaredField("weight");          // зміна protected поля
        field.setInt(animal, 10);

        field = classAnimal.getDeclaredField("breed");           // зміна default поля
        field.set(animal, "Abyssinian");
        System.out.println("Змінені значення полів \n" + animal);
    }
}
