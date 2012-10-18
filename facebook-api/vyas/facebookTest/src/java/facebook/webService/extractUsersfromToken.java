/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook.webService;

import facebookAPI.readUsers;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class extractUsersfromToken {
     public static ArrayList<String> extract(String token) throws SQLException{
        ArrayList<String> temp =readUsers.userData(token);
        return temp;
 }
    
}
