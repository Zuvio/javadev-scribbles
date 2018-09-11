public class Application {
    public static void main(String[] name) {
        System.out.println("Hello world!");
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal bird = new Animal();
        Animal snake = new Animal();
        cat.setName("Kame");
        cat.setAge(5);
        System.out.println("Name is " + cat.getName());
        System.out.println("Age is " + cat.getAge());
        System.out.println("Created " + Animal.aantalAnimalsCreated + " animals.");
        System.out.println(Integer.MAX_VALUE);
    }
}
