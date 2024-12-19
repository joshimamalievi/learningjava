import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class credentials {
 public static boolean checkCredentials(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Username: " + username) && br.readLine().contains("Password: " + password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
