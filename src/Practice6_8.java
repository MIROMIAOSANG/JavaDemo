/**
 * @author johnny
 * 第六章练习8 单例模式
 */
public class Practice6_8 {
    public static void main(String[] args) {
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        System.out.println(ConnectionManager.getConnection());
    }

}

class ConnectionManager {
    public static final int NUMBER = 3;
    private static Connection[] element = new Connection[NUMBER];

    {
        for (Connection connection : element) {
            connection = Connection.getInstance();
        }
    }

    public static Connection getConnection() {
        int index = NUMBER;
        if (index > 0) {
            return element[--index];
        } else {
            return null;
        }
    }
}

class Connection {
    private Connection() {
    }

    static Connection getInstance() {
        return new Connection();
    }
}
