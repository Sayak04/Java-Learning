public class Human {

    
    // private variables are only accessible in the same class
    private int age;
    private String name;

    Human() {
        System.out.println("In Human");
    }
    
    Human(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}