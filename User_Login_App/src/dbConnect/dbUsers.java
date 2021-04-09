package dbConnect;

import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author Piano Hhagens
 */
public class dbUsers extends DBconnection {

    public boolean isValidUser(String User_Name, String password){
        boolean isValid =  false;
        String loginSQL = "SELECT COUNT(*) AS user FROM users WHERE User_Name = :User_Name AND Password = :Password";
        HashMap<String, String> entryData = new HashMap<>();
        entryData.put("User_Name", User_Name);
        entryData.put("Password", password);
        try {
            ResultSet results = this.execute(loginSQL, entryData);
            while (results.next()){
                int counts= results.getInt("User");
                if (counts == 1){
                    isValid = true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return isValid;
    }
}
