import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account a = new Account("Aiden-Sanders");
        System.out.println(a.getUsername());
    }
}