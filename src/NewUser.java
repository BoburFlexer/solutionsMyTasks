public class NewUser {
    String name;
    int age;
    Laptop laptop;

    public NewUser(String name, int age, Laptop laptop) {
        this.name = name;
        this.age = age*2;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "NewUser:" +
                "name=" + name + "\n" +
                "age=" + age + "\n" +
                "laptop=" + laptop;
    }
}
//    NewUser newUser = new NewUser("Bobur", 15, new Laptop("Asus", 900, "2020-01-22"));
//        System.out.println(newUser);