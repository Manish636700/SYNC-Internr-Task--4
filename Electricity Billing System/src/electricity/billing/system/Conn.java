/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

/**
 *
 * @author mitta
 */
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Manish1234@");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
