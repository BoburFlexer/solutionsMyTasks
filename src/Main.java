public class Main {
    public static void main(String[] args) {
        NewUser newUser = new NewUser("Bobur", 15, new Laptop("Asus", 900, "2020-01-22"));
        System.out.println(newUser);
    }
}