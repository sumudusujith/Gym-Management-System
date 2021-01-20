package sample1;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;



public class dbtest {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/gym?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = null;
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first name:");
            String f = input.nextLine();

            System.out.println("Enter last name:");
            String l = input.nextLine();

            String SQL = "INSERT INTO name VALUES('" + f + "','" + l + "')";
            st.executeUpdate(SQL);

            conn.close();

        } catch (Exception e) {
            System.err.println(("Got an exception!"));
            System.err.println(e.getMessage());
        }

        }
    }

