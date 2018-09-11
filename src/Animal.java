public class Animal {
    private String name;
    private int age;
    public static int aantalAnimalsCreated;

    static {
        aantalAnimalsCreated = 0;
    }

    {
        aantalAnimalsCreated++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        int extraJaren = age * 9;
        this.age = age + extraJaren;
    }

    public int getAge() {
        return this.age;
    }
}
