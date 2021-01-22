/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneyonetim;

/**
 *
 * @author yigit
 */
import kutuphaneyonetim.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*
public class baglanti {
    Connection conn;
    
    public static Connection ConnecrDB(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ygt","yigit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"baglantı bozuk");
            return null;
        }
        return null;
    }
}
*/

public class baglanti {
    public static Connection getConnection()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ygt","yigit");
            return con;
        }catch(Exception e)
        {
            System.out.println(e); 
            return null;
        }
    }
    }
        