public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        if (age<18){
            this.age = 0;
        } else if (age>100){
            this.age = 0;
        }

    }

    @Override
    public String toString() {
        return "User:" + "\n" +
                "name:" + name + "\n" +
                "age=" + age;
    }
}
//        User user = new User("Bobur",2);
//        System.out.println(user);