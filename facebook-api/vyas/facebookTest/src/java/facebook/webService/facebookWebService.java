/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook.webService;

import com.restfb.exception.FacebookException;
import facebookAPI.readPages;
import facebookAPI.readPosts;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "facebookWebService")
public class facebookWebService {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "extract")
    @Oneway
    public void extract(@WebParam(name = "token") String token) {
        try {
            extractUsersfromToken.extract(token);
        } catch (SQLException ex) {
            Logger.getLogger(facebookWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readPost")
    public ArrayList<String> readPost(@WebParam(name = "token") String token, @WebParam(name = "pagename") String pagename) {
        try {
            return readPosts.posts(token, pagename);
            //return null;
        } catch (FacebookException ex) {
            Logger.getLogger(facebookWebService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(facebookWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readPages")
    public ArrayList<String> readPages(@WebParam(name = "token") String token) {
        try {
            //TODO write your implementation code here:
            return readPages.pagedata(token);
        } catch (FacebookException ex) {
            Logger.getLogger(facebookWebService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(facebookWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
