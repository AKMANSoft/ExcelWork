package com.akman.excel.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class Javaconnect {

    Connection conn = null;

    // Function To Connect DataBase
    public static Connection ConnecrDb() {
        try {


            Class.forName("org.sqlite.JDBC").newInstance();

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Invoice.sqlite");

            System.out.println("Connection Successful");

            return conn;

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Database empty or not connected"
                    + " or " + e.getMessage() + "");

            return null;

        }
    }
}
