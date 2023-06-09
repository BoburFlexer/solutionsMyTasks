public class Main {
    public static void main(String[] args) {
        User2[] user2s = new User2[4];
        User2 user2 = new User2(1,"Bobur", "Shakirov", 15);
        User2 user21 = new User2(1,"Daniel", "Danielev", 15);
        User2 user22 = new User2(1,"Marsel", "Marselev", 15);
        User2 user23 = new User2(1,"Ahror", "Ahrorov", 17);
        user2s[0] = user2;
        user2s[1] = user21;
        user2s[2] = user22;
        user2s[3] = user23;
        Database database = new Database(user2s);
        System.out.println(database);
    }
}