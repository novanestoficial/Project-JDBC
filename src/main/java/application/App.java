package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/coursejdbc";
        String user = "root";
        String password = "360211";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}