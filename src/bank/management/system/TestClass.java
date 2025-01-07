package bank.management.system;

/*public class TestClass {
}
*/
public class TestClass {
    public static void main(String[] args) {
        Connectionn conn = new Connectionn();
        if (conn.c != null && conn.s != null) {
            System.out.println("Connection and Statement initialized successfully!");
        } else {
            System.out.println("Failed to initialize connection or statement.");
        }
    }
}
