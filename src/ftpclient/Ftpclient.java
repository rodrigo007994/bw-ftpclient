/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpclient;
import bw.ftpclient.BwFtpClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rodrigo
 */
public class Ftpclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String[] array = {"speedtest.tele2.net","anonymous","anonymous@domain.com","1MB.zip","C:\\Users\\rodrigo\\Pictures\\nnnn\\1MB.zip"};
            BwFtpClient.main(array);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Ftpclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
