import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Savetofile extends JPanel{
    public static void saveToFile(String username, String password) {
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myDateF = myDate.format(myFormatDate);
        try (FileWriter writer = new FileWriter("data.txt", true)) {
                writer.write("Username: " + username + "\n");
                writer.write("Password: " + password + "\n");
                writer.write("Date: " + myDateF + "\n"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}