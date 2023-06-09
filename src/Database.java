import java.util.Arrays;

public class Database {
    User2[] user2s;

    public Database(User2[] user2s) {
        this.user2s = user2s;
    }

    @Override
    public String toString() {
        return "Database:" +
                "user2s:" + Arrays.toString(user2s);
    }
}
