import java.io.BufferedReader;
import java.io.FileReader;
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