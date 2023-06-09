public class User2 {
    long id;
    String name;
    String lastName;
    int age;

    public User2(long id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2:" +
                "id=" + id + "\n"+
                "name=" + name + "\n" +
                "lastName=" + lastName + "\n" +
                "age=" + age;
    }
}